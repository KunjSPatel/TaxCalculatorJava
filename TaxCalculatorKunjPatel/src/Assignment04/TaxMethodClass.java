package Assignment04;

import java.lang.reflect.Array;

public class TaxMethodClass {

    static double [][][] variable1 =
            {
                    {
                            {0,1.6,5.6,19.1,39.1},
                            {0,1.4,5.0,17.6,36.6},
                            {0,1.2,4.4,16.1,34.1}
                    },
                    {
                            {0,1.4,5.0,17.6,36.6},
                            {0,1.2,4.4,16.1,34.1},
                            {0,1.0,3.8,14.6,31.6},
                            {0,0.8,3.2,13.1,29.1}
                    }
            };

    static double [][][] variable2 =
            {
                    {
                            {0.08,0.10,0.15,0.20,0.25},
                            {0.07,0.09,0.14,0.19,0.24},
                            {0.06,0.08,0.13,0.18,0.23}
                    },
                    {
                            {0.07,0.09,0.14,0.19,0.24},
                            {0.06,0.08,0.13,0.18,0.23},
                            {0.05,0.07,0.12,0.17,0.22},
                            {0.04,0.06,0.11,0.16,0.21}
                    }
            };

    static int[] variable3 = {0, 20, 60, 150, 250};

    public static double tax(int x, int d, int t){
        if(d > 3 && t == 0){
            d=2;
        }else if(d > 4 && t == 1){
            d=3;
        }else{
            d-=1;
        }

        int var3Index = var3IndexGeneration(x);
        System.out.println(variable1[t][d][var3IndexGeneration(x)] + "+" +  variable2[t][d][var3IndexGeneration(x)] + "*" +  (x - variable3[var3Index]));
        return variable1[t][d][var3IndexGeneration(x)] + variable2[t][d][var3IndexGeneration(x)] * (x - variable3[var3Index]);
    }

    public static int var3IndexGeneration(double X){
        int i;
        if(X <= 20) i = 0;
        else if(X <= 60) i = 1;
        else if(X <= 150) i = 2;
        else if(X <= 250) i = 3;
        else i = 4;
        return i;
    }

}
