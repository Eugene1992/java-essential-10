package cw04.junit;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void f(){
        Assert.assertEquals("H", "HH");
    }

    @Test
    public void g(){
        Assert.assertEquals("H", "H");
    }
}
