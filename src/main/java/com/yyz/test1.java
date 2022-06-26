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

        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        System.out.println(i);
    }
}
