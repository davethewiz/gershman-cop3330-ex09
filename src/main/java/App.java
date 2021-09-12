/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static int StringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static final double sq_ft_per_gallon = 350;

    public static void main( String[] args )
    {
        int length = StringToInt(GetInput("What is the length of the room? "));
        int width = StringToInt(GetInput("What is the width of the room? "));

        int area = length * width;

        double reqGal = (double)area / sq_ft_per_gallon;
        int gal = (int)Math.ceil(reqGal);
        System.out.print("You will need to purchase " + gal + " gallons of paint to cover " + area + " square feet.");
    }
}