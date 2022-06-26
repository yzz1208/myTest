package com.yyz;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author 48467
 * @version 1.0
 * @description: //TODO
 * @date 2022/6/26 9:34
 */
public class test1 {

    public static void main(String[] args) {

        System.out.println("a");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        System.out.println(i);
    }

    @Test
    public void test_1() {
        System.out.println("hello world");
        long a = 10L;
        char b = 97;
        char c= 'b'+1;
        float d=1.0F;
        double e =1.0;

        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("~~~~❥(^_-) ❥(^_-)❥(^_-)");

        for(int i =0;i<4;i++) {
            for (int j = 0; j < 7; j++) {

                if (i+j==3||j-i==3) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }

            }
            System.out.println();
        }
        for(int i =3;i>0;i--) {
            for (int j = 0; j < 7; j++) {

                if (i+j==4||j-i==2) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
