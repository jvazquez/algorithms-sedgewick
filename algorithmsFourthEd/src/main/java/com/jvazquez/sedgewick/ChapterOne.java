package com.jvazquez.sedgewick;

public class ChapterOne {
    public ChapterOne(){
        System.out.println("Program");
        System.out.println("=======");
        System.out.println("1 - Print the result of an operation");
        System.out.println("2 - Print the result of an operation using scientific notation");
        System.out.println("3 - Print the result of a boolean operation");
    }

    public int printOperation(int firstNumber, int secondNumber, int division){
        int result = (firstNumber + secondNumber) / division;
        System.out.printf("1 - (%d + %d) / %d = %d\n", firstNumber, secondNumber, division, result);
        return result;
    }

    public double printOperation(double scientificExponentialNumber, double multiplier){
        double result;
        result = scientificExponentialNumber * multiplier;
        System.out.printf("2 - %f * %f = %f\n", scientificExponentialNumber, multiplier, result);
        return result;
    }

    public boolean printOperation(boolean firstPremiss, boolean secondPremiss){
        boolean result = firstPremiss || secondPremiss;
        System.out.printf("3 - %b || %b = %b\n", firstPremiss, secondPremiss, result);
        return result;
    }
}
