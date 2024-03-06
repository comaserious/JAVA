package com.ohgiraffers.section03.abstraction;

public class EuclidGCD {

    public int gcd(int a , int b ){

        int temp;
        while(true){

            if(a%b==0){
                break;
            }
            else {
                temp=a;
                a=b;
                b=temp%b;

            }

        }

        return b;
    }
}
