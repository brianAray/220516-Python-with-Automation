package com.revature.models;

import java.util.List;

public class Mathematician {
    
    private Calculator calculator;

    public Mathematician(Calculator calculator){
        this.calculator = calculator;
    }

    public int sum(List<Integer> numbers){
        int total = 0;
        for (int num : numbers){
            total = calculator.add(total, num);
        }
        return total;
    }
}
