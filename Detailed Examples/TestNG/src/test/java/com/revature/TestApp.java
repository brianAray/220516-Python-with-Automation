package com.revature;

import static org.mockito.Mockito.when;

import com.revature.calculation.Calculator;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestApp {

    // Declare the object you want to mock with this annotation and a reference
    @Mock
    Calculator mockedAdder;


    // Before the tests are run we need to initialize the mock objects
    @BeforeClass
    public void setup(){
        // Use this annotation before any of the mock objects are used
        // This will make all the mock objects in "this" class actually mocked
        MockitoAnnotations.openMocks(this);
    }

    /*
        This test method declares that its data should be supplied by the
        DataProvider named "numProvider"
        The number of parameters in the test must match the number of columns
        passed by the data provider object
    */
    @Test(dataProvider = "numProvider")
    public void givenTwoInts_whenAdded_thenCorrectAddition(int number1, int number2){
        /*
            We are using a mock object and so we specify what happens when it
            uses the method addition
            If we did not do this then nothing would happen and it would fail
            You need to mock all of the functions of the mocked object when testing
            and the behavior should match what you want the real object to do
        */

        System.out.println("Testing mock adder with numbers: " + number1 + " + " + number2);
        when(mockedAdder.addition(number1, number2)).thenReturn(number1 + number2);

        /*
            After mocking the functionality of the mock object method, we then
            have to actually call it
        */
        int total = mockedAdder.addition(number1, number2);
        System.out.println(total);

        /*
            We use the assertEquals method from testNg that compares what was
            returned by the mock object and what we expect it to be
        */

        Assert.assertEquals(total, number1 + number2);
    }

    @DataProvider
    public Object[][] numProvider(){
        /*
            Data provider has two dimensional array
            First one is the data set, second one is the values
            Rows - Number of times you want the test repeated
            Columns - Number of parameters in test data
        */
        Object[][] data = new Object[3][2];

        // 1st row
        data[0][0] = 32;
        data[0][1] = 12;

        // 2nd row
        data[1][0] = 214;
        data[1][1] = 556;

        // 3rd row
        data[2][0] = 1;
        data[2][1] = -423;

        return data;
    }


}
