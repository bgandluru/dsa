package com.tiga.sort.decreaseconquer;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] input = {8,6,3,1,2,9};     
        input = sort(input); 
            System.out.println(Arrays.toString(input));
    }


    static int[] sort(int[] input){

        for (int i = 0;i<input.length-1;i++) {

             int temp = input[i];
             int j = i-1;
              
             while(j >= 0) {
                  if(input[j] > temp ) {
                     input[j+1] = input[j];
                     input[j]= temp;
                     j--;
                  } else {
                    input[j+1] = temp;
                    j--;
                  }
                  System.out.println(Arrays.toString(input));
                }
           // input[j+1] = temp;
                
            }
        return input;
    }

    
}
