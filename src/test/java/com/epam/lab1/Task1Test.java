package com.epam.lab1;

import com.epam.lab1.task1.Expression;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class Task1Test extends Assert {

    public static final double DELTA = 0.00001;

    private double inputX;
    private double inputY;
    private double expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0, 0.5},
                {25, 25, 25.03959}, {-1, 0, -0.43064}, {-1, -1, -0.08659}});
    }


    public Task1Test(double inputX, double inputY, double expected) {
        this.inputX = inputX;
        this.inputY = inputY;
        this.expected = expected;
    }


    @Test
    public void execute(){
        Assert.assertEquals(expected, Expression.consider(inputX, inputY), DELTA);
    }
}

