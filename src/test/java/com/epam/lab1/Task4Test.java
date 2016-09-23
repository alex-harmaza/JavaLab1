package com.epam.lab1;

import com.epam.lab1.task4.bl.Array;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class Task4Test extends Assert {

    private int[] input;
    private int[] expected;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{1, 2, 4, 6}},
                {new int[]{4, 6, 8}, new int[0]}
        });
    }


    public Task4Test(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }


    @Test
    public void execute(){
        List<Integer> actual = Array.getIndexesOfPrimes(input);
        assertArrayEquals("The result is not the same", expected, convertToPrimitiveArray(actual));
    }


    private int[] convertToPrimitiveArray(List<Integer> list){
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
