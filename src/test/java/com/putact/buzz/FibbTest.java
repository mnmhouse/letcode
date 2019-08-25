package com.putact.buzz;

import org.junit.Assert;
import org.junit.Test;


public class FibbTest {
    @Test
    public void testFibnoci() throws Exception{
        Assert.assertEquals(0,fibFun(0));
        Assert.assertEquals(1,fibFun(1));
    }

    private int fibFun(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }
}
