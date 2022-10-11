package com.tiga.sort.bruteforce;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args){
        int[] input = {8,6,3,1,2,9};     
             input = sort(input); 
         System.out.println(Arrays.toString(input));
 
     }

     static int[] sort(int[] input){

        for(int i=0;i<input.length-1;i++){
            int min=i;
            for(int j=i+1;j<input.length-1;j++){
                  if (input[j]<input[min]){
                      min = j;
                  }
            }

            int tmp = input[i];
            input[i] = input[min];
            input[min] = tmp;
        }
        
        return input;
     }
}
