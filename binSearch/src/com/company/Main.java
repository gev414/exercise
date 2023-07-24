package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        autoBinSearch();
    }

    private static void autoBinSearch() {
        int minRandom = 2;
        int maxRandom = Integer.MAX_VALUE/2;
        int n = random.nextInt(maxRandom-minRandom) - minRandom;
        System.out.println("array length: " + n);
        int a = random.nextInt(100);
        System.out.println("number to search for: "+a);

        //generate array
        // gonna take a while
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE/2);
        }
        Arrays.sort(arr);

        //search
        int low= 0;
        int high = arr.length-1;
        int counter= 0;
        while(low<=high){
            int midPos = (low + high) / 2;
            int midNum = arr[midPos];
            if (a == midNum){
                System.out.println("-----------------------------\n" +
                        "Number found at position: " + midPos + "\n" +
                        "Iterations: "+ counter);
                break;
            }
            if (a < midNum){
                high = midPos - 1;
            }else {
                low = midPos + 1;
            }
            counter++;
        }
    }
}