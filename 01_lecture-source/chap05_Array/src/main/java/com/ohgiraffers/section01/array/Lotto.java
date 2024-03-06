package com.ohgiraffers.section01.array;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) {

        int[] lotto = new int[6];

        while(true){

            for (int i =0 ; i<lotto.length;i++){

                lotto[i] = (int)(Math.random()*51)+1;

            }


            for (int i = 1 ; i < lotto.length; i++){

                int tempt = 0;


                for (int j =0; j<i;j++){

                        tempt = lotto[i];

                    if (lotto[i]<lotto[j]){

                        lotto[i] = lotto[j];
                        lotto[j] = tempt;

                    }

                }

            }

            if (!( (lotto[0] == lotto[1]) || (lotto[1]==lotto[2]) || (lotto[2]==lotto[3]) || (lotto[3]==lotto[4]) || (lotto[4]==lotto[5]) ) ){

                break;
            }



        }

        for (int i = 0 ; i<lotto.length;i++){

        System.out.print(lotto[i]+", ");
        }




    }
}
