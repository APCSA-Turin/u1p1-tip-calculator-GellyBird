package com.example.project;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// Rounding learned from: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        DecimalFormat df = new DecimalFormat("#.##"); 
        double tip = cost * ((double)percent / 100); // Multiples the cost of the food with the tip (whole number/100 to make it a decimal)
        double total = tip + cost; // Adds the tip and food cost together
        double originalCostPerPerson = cost / people; // divides the food cost prior to the tip by the number of people
        double tipPerPerson = tip / people; // divides the tip cost by the number of people 
        double totalPerPerson = total / people; // divides the cost with tip by the number of people


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + (df.format(tip)) + "\n");
        result.append("Total Bill with tip: $" + (df.format(total)) + "\n");
        result.append("Per person cost before tip: $" + (df.format(originalCostPerPerson)) + "\n");
        result.append("Tip per person: $" + (df.format(tipPerPerson)) + "\n");
        result.append("Total cost per person: $" + (df.format(totalPerPerson)) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
