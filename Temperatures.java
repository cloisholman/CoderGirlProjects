package com.company;

import java.util.Timer;

public class Temperatures
{
public static void main (String args[]){
//define the values inside array named temps
    int [][] temps = {
            {68, 70, 76, 70, 68, 71, 75},
            {76, 76, 87, 84, 82, 75, 83},
            {73, 72, 81, 78, 76, 73, 77},
            {64, 65, 69, 68, 70, 74, 72} };
    //define values inside arrays named days and timeBlocks
    String [] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};
    String [] timeBlocks = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};

//here I make the value constant for the number of items in the array.
// In this case TIME corresponds to the rows and DAYS corresponds to the columns in the array
    final int TIME = temps.length;
    final int DAYS = temps[0].length;

//Here I create an array that is the length of the column (TIME) and the length of the row (DAYS)
    int [] timeSum = new int[TIME];
    int [] daySum = new int [DAYS];
    int finalSum = 0;

    //This loop calculates the sum of the times, days, and puts it in to proper array
    for (int row = 0; row < TIME; row++)
    {
        for (int column =0; column < DAYS; column++)
        {
        timeSum[row] += temps[row][column];
        daySum [column] += temps[row][column];
        finalSum += temps[row][column];
        }
    }

//This for loop prints out the raw temperature data
    System.out.println("Temperature Calculator");
    System.out.println();
    System.out.println("The data provided are:");
    for (int row = 0; row < TIME; row++)
    {
        System.out.print(timeBlocks[row]);
        for (int column =0; column < DAYS; column++){
            System.out.print(temps [row][column] + ", ");
        }
        System.out.println();
    }

    System.out.println();

    System.out.println("Based on that data, the following are the average temperatures for the week.");

    //This for loops prints out the averages for each days
    for (int row = 0; row < DAYS; row++)
    {
        System.out.println(days[row] + (daySum[row]/TIME));
    }
    System.out.println();

    //This for loop prints out the averages for time interval 
    for (int row = 0; row < TIME; row++)
    {
        System.out.println(timeBlocks[row] + (timeSum[row]/DAYS));
    }
    System.out.println("The final average temperature for the week was:");
    System.out.println();
    System.out.println("Overall: " + (finalSum/(TIME * DAYS)));
}
}
