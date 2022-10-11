package com.tiga.sort.bruteforce;

import java.util.Arrays;

public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args){
       int[] input = {8,6,3,1,2,9};     
            input = sort(input); 
        System.out.println(Arrays.toString(input));

    }

    static int[] sort(int[] input){
        for (int i=0;i<input.length-1;i++){
            for (int j = 0;j<input.length-1;j++){
                if (input[j] > input[j+1]){
                    int tmp = input[j];
                    input[j]= input[j+1];
                    input[j+1] = tmp;
                }
            }
        }
        return input;
    }
    
}
