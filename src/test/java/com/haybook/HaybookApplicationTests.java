package com.haybook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HaybookApplicationTests {
    @Autowired
    private HaybookApplication haybookApplication;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSum() {
        int a, b, sum;
        a = 1;
        b = 5;
        int result = haybookApplication.sum(a, b);
        assertEquals(6, result);
    }
}
