package com.revature;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.revature.models.Calculator;
import com.revature.models.Mathematician;

public class TestMathematician {
    
    @Mock 
    private Calculator mockCalculator;

    private Mathematician mathematician;

    @BeforeClass
    public void setup(){
        MockitoAnnotations.openMocks(this);
        mathematician = new Mathematician(mockCalculator);
    }

    @Test
    public void givenTwoInts_whenAdded_thenCorrectAddition(){
        List<Integer> numbers = new ArrayList();

        numbers.add(5);
        numbers.add(10);

        when(mockCalculator.add(0, numbers.get(0))).thenReturn(5);
        when(mockCalculator.add(5, numbers.get(1))).thenReturn(15);
        
        Assert.assertEquals(mathematician.sum(numbers), 15);
    }


    @Test(dataProvider = "numProvider")
    public void givenTwoInt_whenAdded_thenCorrectAddition_data_provider(List<Integer> numbers, int initialSum, int finalSum){

        when(mockCalculator.add(0, numbers.get(0))).thenReturn(initialSum);
        when(mockCalculator.add(initialSum, numbers.get(1))).thenReturn(finalSum);

        Assert.assertEquals(mathematician.sum(numbers), finalSum);
    }

    @DataProvider
    public Object[][] numProvider(){
        
        Object[][] data = new Object[3][3];

        // 1st row
        data[0][0] = Arrays.asList(30, 10);
        data[0][1] = 30;
        data[0][2] = 40;

        // 2nd row
        data[1][0] = Arrays.asList(-100, 10);
        data[1][1] = -100;
        data[1][2] = 90;

        // 3rd row
        data[2][0] = Arrays.asList(500, 9);
        data[2][1] = 500;
        data[2][2] = 509;

        return data;
    }

}
