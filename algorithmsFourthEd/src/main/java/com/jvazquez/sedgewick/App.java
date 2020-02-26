package com.jvazquez.sedgewick;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int firstNumber = 0;
        int secondNumber = 15;
        int division = 2;
        double scientificNotationNumber = 2.0e-6;
        double multiplier = 100000000.1;
        boolean firstPremiss = true && false;
        boolean secondPremiss = true && true;

        ChapterOne chapterOne = new ChapterOne();
        chapterOne.printOperation(firstNumber, secondNumber, division);
        chapterOne.printOperation(scientificNotationNumber, multiplier);
        chapterOne.printOperation(firstPremiss, secondPremiss);
    }
}
