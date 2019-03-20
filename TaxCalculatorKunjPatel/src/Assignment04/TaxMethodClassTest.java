package Assignment04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TaxMethodClassTest {
    private int number1;
    private int number2;
    private int number3;
    private double expectedNumber;
    private double expectedPrecision = 0.0000000001;

    public TaxMethodClassTest(int number1, int number2, int number3, double expectedNumber) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10,1,0,0.8},
                {20,1,0,1.6},
                {30,1,0,2.6},
                {60,1,0,5.6},
                {100,1,0,11.6},
                {150,1,0,19.1},
                {175,1,0,24.1},
                {250,1,0,39.1},
                {300,1,0,51.6},
                {1000,1,0,226.6},
                {10,2,0,0.7},
                {20,2,0,1.4},
                {30,2,0,2.3},
                {60,2,0,5},
                {100,2,0,10.6},
                {150,2,0,17.6},
                {175,2,0,22.35},
                {250,2,0,36.6},
                {300,2,0,48.6},
                {1000,2,0,216.6},
                {10,3,0,0.6},
                {20,3,0,1.2},
                {30,3,0,2},
                {60,3,0,4.4},
                {100,3,0,9.6},
                {150,3,0,16.1},
                {175,3,0,20.6},
                {250,3,0,34.1},
                {300,3,0,45.6},
                {1000,3,0,206.6},
                {10,1,1,0.7},
                {20,1,1,1.4},
                {30,1,1,2.3},
                {60,1,1,5},
                {100,1,1,10.6},
                {150,1,1,17.6},
                {175,1,1,22.35},
                {250,1,1,36.6},
                {300,1,1,48.6},
                {1000,1,1,216.6},
                {10,2,1,0.6},
                {20,2,1,1.2},
                {30,2,1,2},
                {60,2,1,4.4},
                {100,2,1,9.6},
                {150,2,1,16.1},
                {175,2,1,20.6},
                {250,2,1,34.1},
                {300,2,1,45.6},
                {1000,2,1,206.6},
                {10,3,1,0.5},
                {20,3,1,1},
                {30,3,1,1.7},
                {60,3,1,3.8},
                {100,3,1,8.6},
                {150,3,1,14.6},
                {175,3,1,18.85},
                {250,3,1,31.6},
                {300,3,1,42.6},
                {1000,3,1,196.6},
                {10,4,1,0.4},
                {20,4,1,0.8},
                {30,4,1,1.4},
                {60,4,1,3.2},
                {100,4,1,7.6},
                {150,4,1,13.1},
                {175,4,1,17.1},
                {250,4,1,29.1},
                {300,4,1,39.6},
                {1000,4,1,186.6}
        });
    }

    @Test
    public void testAdd(){
        assertEquals(expectedNumber, TaxMethodClass.tax(number1,number2,number3),expectedPrecision);
    }
}

