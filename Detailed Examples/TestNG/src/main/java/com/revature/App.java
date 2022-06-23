package com.revature;

import com.revature.calculation.Calculator;

public class App {
    public static void main(String[] args) {

        Calculator adder = new Calculator();

        adder.addition(123, 12);
        adder.addition(442L, 123L);
        adder.addition(123.23F, 12312.234F);
    }
}
