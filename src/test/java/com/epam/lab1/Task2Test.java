package com.epam.lab1;

import com.epam.lab1.task2.bl.Region;
import com.epam.lab1.task2.entity.Point;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class Task2Test extends Assert {

    private Point input;
    private boolean expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Point(-4.0, 5.0), true},
                {new Point(4.0, 5.0), true},

                {new Point(-4.0, 0.0), true},
                {new Point(4.0, 0.0), true},

                {new Point(6.0, 0.0), true},
                {new Point(-6.0, 0.0), true},

                {new Point(-6.0, -2.0), true},
                {new Point(6.0, -2.0), true},

                {new Point(1.0, 1.0), true},
                {new Point(-2.0, -2.0), true},

                {new Point(-5.0, 1.0), false},
                {new Point(5.0, 1.0), false},

                {new Point(0.0, 6.0), false},
                {new Point(0.0, -4.0), false},
        });
    }


    public Task2Test(Point input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }


    @Test
    public void execute(){
        Assert.assertEquals("point " + input.toString(), expected, Region.isInclude(input));
    }
}
