package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int veggieSandwichesSold;
        int burgersSold;
        int subsSold;
        int soupSold;
        boolean result;
        boolean madeAllGoals = true;




        out.println("Checking Sales Goals");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");

        veggieSandwichesSold = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("");
        result = (veggieSandwichesSold >49);

        if (veggieSandwichesSold > 49 ) {
            out.println("Made goal for veggies");
        } else {
            out.println("Fell short for veggies");
            madeAllGoals = false;
        }
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");

        burgersSold = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("");
        result = (burgersSold >249);

        if (burgersSold > 249) {
            out.println("Made goal for burgers");
        } else {
            out.println("Fell short for burgers");
            madeAllGoals = false;
        }

        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");

        subsSold = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("");
        result = (subsSold >179);

        if (subsSold > 179 ) {
            out.println("Made goal for subs");
        } else {
            out.println("Fell short for subs");
            madeAllGoals = false;
        }
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");

        soupSold = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("");
        result = (soupSold >69);

        if (soupSold > 69 ) {
            out.println("Made goal for subs");
        } else {
            out.println("Fell short for subs");
            madeAllGoals = false;
        }
        out.println("");
        if (madeAllGoals == true) {
            out.println("Made goal for everything!");
        }


    }














}

