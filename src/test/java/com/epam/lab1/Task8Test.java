package com.epam.lab1;


import com.epam.lab1.task8.bl.Sequence;
import org.junit.Assert;
import org.junit.Test;


public class Task8Test extends Assert {

    @Test
    public void checkTheAssociationOfSequences(){
        double[] firstSequence = new double[] {4, 7, 8, 10};
        double[] secondSequence = new double[] {0, 1, 2, 3, 5, 6, 9};
        String[] expected = new String[]{"b[0]", "b[1]", "b[2]", "b[3]",
                "a[0]", "b[4]", "b[5]", "a[1]", "a[2]", "b[6]", "a[3]"};

        String[] actual = Sequence.createAscendingSequence(firstSequence, secondSequence);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNotIncreasingSequence(){
        double[] sequence = new double[]{5, 2, 8, 9, 1};
        Sequence.createAscendingSequence(sequence, sequence);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEmptyInputArray(){
        Sequence.createAscendingSequence(new double[0], null);
    }

}
