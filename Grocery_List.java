package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class Grocery_List
{

    public static void main(String[] args)
    {
	Scanner keyboard = new Scanner(System.in);
	String item1;
	String item2;
	String item3;
	int item1_qty;
	int item2_qty;
	int item3_qty;
	float price1;
	float price2;
	float price3;
	float total;



	out.println("Please list three items on your grocery shopping list");
	out.print("Item 1? ");
	item1 = keyboard.nextLine();
	out.println("");
	out.print("Item 2? ");
	item2 = keyboard.nextLine();
	out.println("");
	out.print("Item 3? ");
	item3 = keyboard.nextLine();
	out.println("");

	out.println("Now please enter the quantity of each item");
	out.print("How many " + item1 + "? ");
	item1_qty = keyboard.nextInt();
	out.println("");
	out.print("How many " + item2 + "? ");
	item2_qty = keyboard.nextInt();
	out.println("");
	out.print("How many " + item3 + "? ");
	item3_qty = keyboard.nextInt();
	out.println("");

	out.println("Now please enter the price of each item");
	out.print("How much does one " + item1 + " cost? ");
	price1 = keyboard.nextFloat();
	out.println("");
	out.print("How much does one " + item2 + " cost? ");
	price2 = keyboard.nextFloat();
	out.println("");
	out.print("How much does one " + item3 + " cost? ");
	price3 = keyboard.nextFloat();
	out.println("");
	out.println("Calculating your grocery bill.");

	total = ((float)item1_qty * price1) + ((float)item2_qty * price2) + ((float)item3_qty * price3);
	out.println("Your total cost is " + total);
	}
}
