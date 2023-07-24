package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
    Garden(12);

    }

    public static void Garden(int range){

        int[][] garden = new int[range][range];
        Random random = new Random();
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden.length; j++) {
                garden[i][j] = random.nextInt(2);
            }
        }

        // draw
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden.length; j++) {
                if(garden[i][j]==1){
                    System.out.print(" | ");
                }else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }

        // Carrotfinder-3000
        //could make it so it will skip every other row/column so it skips already "eaten" carrots by
        // changing the iterator incrementation to "i+=2", but im not sure if that's the goal"
        int leaps=0;
        for (int i = 0; i < garden.length-1; i++) {
            for (int j = 0; j < garden.length-1; j++) {
                if (garden[i][j]<garden.length){
                    if (garden[i][j]==1 && garden[i][j+1]==1 &&
                            garden[i+1][j]==1 && garden[i+1][j+1]==1){
                        leaps++;
                    }
                }
            }
        }

        System.out.println("Number of leaps: "+leaps);
    }


    }

