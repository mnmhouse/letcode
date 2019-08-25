package com.putact.buzz;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BuzzFeedTestV2 {

    @Test
    public void testNumber() {
        checkGameNumberOutPut(5,"feed");
        checkGameNumberOutPut(3,"buzz");
    }

    private void checkGameNumberOutPut(int i ,String test) {
        Assert.assertThat(new GuessNumber(i).toString(), is(test));
    }

 @Test
 public void test() throws Exception{
 }



}
