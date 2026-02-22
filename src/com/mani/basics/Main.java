package com.mani.basics;

import java.util.Scanner;
import java.lang.String;

class EorD{
    void eo(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

class Greeting{
    void greet(String name){
        System.out.println("Hello, Welcome to our site "+name);
    }
}

class Pi{
    void interest(float principle,float rate, float time){
        System.out.println("your interest ="+(principle*rate*time)/100);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        //even or odd
//        System.out.println("Enter an Integer:");
//        int n = sc.nextInt();
//        EorD e = new EorD();
//        e.eo(n);
        //greeting
//        String name = sc.next();
//        Greeting greeting = new Greeting();
//        greeting.greet(name);
        //simple interest
        float principle=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        Pi pi = new Pi();
        pi.interest(principle,rate,time);

    }
}
