package com.epam.lab1.task5;
import java.util.Arrays;


public class Sequence {

    public static int getMinDeleteCountForRisingSequence(int[] source){
        int[] subSequenceSize = new int[source.length];
        Arrays.fill(subSequenceSize, 1);

        for (int i = 0; i < source.length - 1; i++){
            for (int j = i + 1; j < source.length; j++){
                if (source[j] > source[i]){
                    if (subSequenceSize[i] + 1 > subSequenceSize[j]){
                        subSequenceSize[j] = subSequenceSize[i] + 1;
                    }
                }
            }
        }

        Arrays.sort(subSequenceSize);
        int result = (subSequenceSize[subSequenceSize.length - 1] == 1) ? -1
                : source.length - subSequenceSize[subSequenceSize.length - 1];
        return result;
    }

}
