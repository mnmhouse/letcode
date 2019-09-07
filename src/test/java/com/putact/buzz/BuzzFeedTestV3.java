package com.putact.buzz;

import org.junit.Assert;
import org.junit.Test;

public class BuzzFeedTestV3 {

    @Test
    public void test_buzz(){
        Assert.assertEquals("1",BuzzFeedV3.of(1));
        Assert.assertEquals("Buzz",BuzzFeedV3.of(3));
    }
}
