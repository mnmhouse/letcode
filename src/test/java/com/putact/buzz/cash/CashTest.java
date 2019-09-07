package com.putact.buzz.cash;

import com.putact.letcode.cash.Dollar;
import org.junit.Assert;
import org.junit.Test;

public class CashTest {
    @Test
    public void testMultiplication() throws Exception{

        Dollar five =new Dollar(5);
        five.times(2);
        Assert.assertEquals(10,five.amount);
    }
}
