package com.haybook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test(expected = IllegalArgumentException.class)
    public void testFindDuplicatesAisNull() {
        List<Integer> a = null;
        List<Integer> b = new ArrayList<>();
        haybookApplication.findDuplicates(a, b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindDuplicatesBisNull() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = null;
        haybookApplication.findDuplicates(a, b);
    }

    @Test
    public void findDuplicatesNormal() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(4);
        a.add(5);
        b.add(5);
        b.add(6);
        List<Integer>result=haybookApplication.findDuplicates(a,b);
        assertEquals(Arrays.asList(5),result);
    }
}
