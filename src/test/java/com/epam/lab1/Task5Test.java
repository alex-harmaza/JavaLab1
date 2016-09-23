package com.epam.lab1;

import com.epam.lab1.task5.Sequence;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by alexh on 22.09.2016.
 */
@RunWith(Parameterized.class)
public class Task5Test extends Assert {

    private int[] input;
    private int expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1, 6, 6, 2, 3}, 2},
                {new int[]{5, 4, 3, 2, 1}, -1},
                {new int[]{1, 4, 5, 2}, 1},
                {new int[]{-5, 1, -2, 3, 5}, 1}
        });
    }

    public Task5Test(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void execute(){
        assertEquals("Incorrect result", Sequence.getMinDeleteCountForRisingSequence(input), expected);
    }
}
