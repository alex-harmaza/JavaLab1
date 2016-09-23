package com.epam.lab1.task8.bl;

import com.epam.lab1.task8.entity.Element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sequence {

    public static String[] createAscendingSequence(double[] a, double[] b){
        if (a.length == 0){
            throw new IllegalArgumentException("Empty array 'a'");
        }
        if (b.length == 0) {
            throw new IllegalArgumentException("Empty array 'b'");
        }
        if (!isIncreasingSequence(a)){
            throw new IllegalArgumentException("Array 'a' is not increasing sequence");
        }
        if (!isIncreasingSequence(b)){
            throw new IllegalArgumentException("Array 'b' is not increasing sequence");
        }

        List<Element> sequence = new ArrayList<Element>(a.length + b.length);
        for (int i = 0; i < a.length; i++){
            sequence.add(new Element("a[" + i + "]", a[i]));
        }
        for (int i = 0; i < b.length; i++){
            sequence.add(new Element("b[" + i + "]", b[i]));
        }

        Collections.sort(sequence);

        String[] result = new String[sequence.size()];
        for (int i = 0; i < sequence.size(); i++){
            result[i] = sequence.get(i).getMark();
        }
        return result;
    }


    public static boolean isIncreasingSequence(double[] sequence){
        boolean result = true;
        for (int i = 1; i < sequence.length; i++){
            if (sequence[i - 1] > sequence[i]){
                result = false;
                break;
            }
        }
        return result;
    }
}
