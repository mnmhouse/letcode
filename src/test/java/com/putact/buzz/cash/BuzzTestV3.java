package com.putact.buzz.cash;

import com.putact.buzz.BuzzFeed;
import org.junit.Assert;
import org.junit.Test;

public class BuzzTestV3 {
    @Test
    public void testBuzz() throws Exception{
        Assert.assertEquals("buzz",BuzzFeed.getResult(3));
        Assert.assertEquals("buzz",BuzzFeed.getResult(6));
        Assert.assertEquals("feed",BuzzFeed.getResult(5));
        Assert.assertEquals("buzzfeed",BuzzFeed.getResult(15));
        Assert.assertEquals("7",BuzzFeed.getResult(7));
    }
}
