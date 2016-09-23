package com.epam.lab1;


import com.epam.lab1.task3.bl.Math;
import com.epam.lab1.task3.entity.Segment;
import com.epam.lab1.task3.entity.Table;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class Task3Test extends Assert {

    public static final double DELTA = 0.0000001;

    private Segment inputSegment;
    private double inputStep;
    private Table expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Segment(0.0, 1.5), 0.5, new Table(new double[][]{{0.0, 0.0}, {0.5, 0.5463024898},
                                {1.0, 1.5574077247}, {1.5, 14.1014199472}})}
        });
    }

    public Task3Test(Segment inputSegment, double inputStep, Table expected) {
        this.inputSegment = inputSegment;
        this.inputStep = inputStep;
        this.expected = expected;
    }

    @Test
    public void execute(){
        List<double[]> actual = Math.tan(inputSegment, inputStep).getData();
        List<double[]> expectedList = expected.getData();
        assertEquals("Incorrect number of lines in tables", expectedList.size(), actual.size());
        for (int i = 0; i < expectedList.size(); i++){
            assertArrayEquals("In line " + i + " error", expectedList.get(i), actual.get(i), DELTA);
        }
    }
}