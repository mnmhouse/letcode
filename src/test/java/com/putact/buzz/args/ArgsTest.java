package com.putact.buzz.args;

import com.putact.letcode.cash.Args;
import org.junit.Assert;
import org.junit.Test;

public class ArgsTest {
    @Test
    public void testArgs() throws Exception{

        Assert.assertEquals("5", Args.parser(new String[]{"-p","5"}));
    }
}
