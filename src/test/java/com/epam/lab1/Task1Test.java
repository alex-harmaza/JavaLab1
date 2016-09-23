package com.epam.lab1;

import com.epam.lab1.task1.Expression;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by alexh on 21.09.2016.
 */
@RunWith(Parameterized.class)
public class Task1Test extends Assert {

    public static final double DELTA = 0.0000001;

    private double inputX;
    private double inputY;
    private double expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0, 0.5}, {0, 0, 0.5}});
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

