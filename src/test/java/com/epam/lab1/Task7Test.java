package com.epam.lab1;

import com.epam.lab1.task7.ShellSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class Task7Test extends Assert {

    public static final double DELTA = 0.00000001;

    private double[] input;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new double[] {5.0, 8.0, 9.0, 4.0, 5.0, 1.0, 6.0, 4.0, 5.0}},
                {new double[] {-9.0, -12.0, -9.1, 5.6, 8.1, 1.2, -8.8, -1.1}}
        });
    }


    public Task7Test(double[] input) {
        this.input = input;
    }


    @Test
    public void execute(){
        double[] expected = input.clone();
        ShellSort.execute(input);
        Arrays.sort(expected);
        assertArrayEquals("Incorrect shell sorting", expected, input, DELTA);
    }
}
