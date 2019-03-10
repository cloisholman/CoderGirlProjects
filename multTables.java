package com.company;
import java.util.Scanner;

public class multTables {
    public static void tables (int size)
    {
        //this method prints the multiplication tables from 0*0 to size * size
        for (int firstNumber = 0; firstNumber <= size; firstNumber++)
        {
            for (int secNumber = 0; secNumber <= size; secNumber++)
            {
                System.out.println(firstNumber + " * " + secNumber + " = " + (firstNumber * secNumber));
            }
        }
    }

    public static int getNumber ()
    {
        /*this method asks the user for a number. It will keep asking for a number until
        the user enters a number between 0 and 20. It will return the number they entered */

        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        while (size > 20 || size < 0){
            System.out.print("Please enter a number between 0 and 20 ");
            size = keyboard.nextInt();
            keyboard.skip("\n");

        }
        return size;
    }
    public static void main (String[] args){

        System.out.println("Welcome to Multiplication Tables");
        System.out.println("");
        System.out.print("How large would you like to see them? ");

        tables(getNumber()); //Method getNumber is called and then method tables is called, per order of operations
    }
}
