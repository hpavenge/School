package com.example.nbsm.headfirstoop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import com.example.nbsm.headfirstoop.Chapter9.Unit;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test4() throws RuntimeException{
        Unit unit = new Unit(1);
        String propertyName = "hitpoints";
        System.out.println("testing non existent property");
        try {
            Object outputValue = unit.getProperty(propertyName);
            Assert.fail("should trown Exception");
        }catch (RuntimeException e){
            System.out.println("test success");
        }
    }
}