package com.hillel.reziapov.homeworks.homework6;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(trueFalse(10, 9));
        demo(-4);
        System.out.println(demo1(-5));
        demo2("Ukraine", 5);
        System.out.println(demo3());

    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = -10;
        int b = -50;
        int sum;

        sum = a + b;

        if (sum >= 0) {
            System.out.println("Сума позитивна");
        } else
            System.out.println("Сума негативна");
    }

    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Червоний");
        }
        if (value > 100) {
            System.out.println("Зелений");
        } else {
            System.out.println("Жовтий");
        }
    }

    public static void compareNumbers() {
        int a = 49;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean trueFalse(int a, int b) {
        int sum = a + b;
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void demo(int a) {
        if (a >= 0) {
            System.out.println("Число позитивне");
        } else {
            System.out.println("Число від'ємне");
        }
    }

    static boolean demo1(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void demo2(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean demo3() {
        int year = 2023;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}




