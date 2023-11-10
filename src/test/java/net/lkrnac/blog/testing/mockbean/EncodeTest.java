package net.lkrnac.blog.testing.mockbean;

import org.junit.Assert;
import org.junit.Test;

public class EncodeTest {
    @Test
    public void TestEncode(){
        Assert.assertEquals(com.mycompany.app.App.Encode(), "Hello");
    }
}
