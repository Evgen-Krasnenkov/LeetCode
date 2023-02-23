package com.algorithm;

public class PowerFactorial {
    public static void main(String[] args) {
        int power = PowerFactorial.power(2, 3);
        System.out.println(power);
        int factor = PowerFactorial.factor(5);
        System.out.println(factor);
    }

    static int power(int number, int pwr){
        if (pwr == 0) {
            return 1;
        } else {
            return number * power(number, pwr - 1);
        }
    }

    static int factor(int number){
        if (number == 0) {
            return 1;
        }
        return number * factor(number - 1);
    }
}
