package org.practice.geeksforgeeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] array={1,2,0,3,0,4};
        int nonZeroIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                int temp=array[i];
                array[i]=array[nonZeroIndex];
                array[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        }
    }
}
