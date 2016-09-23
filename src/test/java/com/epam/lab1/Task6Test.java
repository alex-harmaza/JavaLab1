package com.epam.lab1;

import com.epam.lab1.task3.entity.Table;
import com.epam.lab1.task6.Matrix;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class Task6Test extends Assert {

    public static final double DELTA = 0.00000001;

    private double[] input;
    private Table expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new double[]{1, 2, 3, 4, 5}, new Table(new double[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1},
                        {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}})}
        });
    }


    public Task6Test(double[] input, Table expected) {
        this.input = input;
        this.expected = expected;
    }


    @Test
    public void execute(){
        List<double[]> actual = Matrix.create(input).getData();
        List<double[]> expectedList = expected.getData();

        assertEquals("Incorrect size", expectedList.size(), actual.size());
        for (int i = 0; i < actual.size(); i++){
            assertArrayEquals("Incorrect line " + i, expectedList.get(i), actual.get(i), DELTA);
        }
    }
}
