package com.company;


import java.rmi.server.ExportException;
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Iskl isk = new Iskl();
        isk.questionOne();
    }

    static class Iskl {
        Scanner sc = new Scanner(System.in);

        public void questionOne() {
            int n = (int) (Math.random() * 10);
            int[] mass = new int[n];
            int num = sc.nextInt();
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * 10 - 10);
                try {
                    System.out.println(num / mass[i]);
                } catch (ArithmeticException ex) {
                    ex.printStackTrace(System.out);
                }
            }
        }
    }
}

