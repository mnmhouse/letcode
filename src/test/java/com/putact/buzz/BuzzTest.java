package com.putact.buzz;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BuzzTest {
    @Test
    public void TestBuzz(){
        getFeed("buzz", new Buzz().getBuzzString(3));
        getFeed("feed", new Buzz().getBuzzString(5));
    }

    private void getFeed(String feed, String buzzString) {
        Assert.assertEquals(feed, buzzString);
    }

    @Test
    public void should_test_raw_number() {
        getResult(1,"1");
    }

    private void getResult(int i,String j) {
        Assert.assertThat(new GameNumber(i).toString(),is(j));
    }


}
