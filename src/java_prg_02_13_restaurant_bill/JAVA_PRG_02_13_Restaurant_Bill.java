/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_13_restaurant_bill;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that computes the tax and tip on a restaurant bill. The
 * program should ask the user to enter the charge for the meal. The tax should
 * be 6.75 percent of the meal charge. The tip should be 20 percent of the
 * total after adding the tax. Display the meal charge, tax amount, tip amount,
 * and total bill on the screen.
 */
public class JAVA_PRG_02_13_Restaurant_Bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare tip and tax rate as constants
        final float FLT_TIP_RATE = 0.20f;
        final float FLT_TAX_RATE = 0.0675f;
        
        // Declare variables
        float fltMealCostInitial;
        float fltMealTax;
        float fltMealTip;
        float fltMealCostFinal;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt and get user input
        System.out.print("Please enter the total cost of the meal: $");
        fltMealCostInitial = scrKeyboard.nextFloat();
        
        // Calculate meal + tax + final rate
        fltMealTax = fltMealCostInitial * FLT_TAX_RATE;
        fltMealTip = (fltMealCostInitial + fltMealTax) * FLT_TIP_RATE;
        fltMealCostFinal = fltMealCostInitial + fltMealTax + fltMealTip;
        
        // Output calculated totals to the console
        System.out.println("Tax cost: $" + fltMealTax);
        System.out.println("Total Tip: $" + fltMealTip);
        System.out.println("Total meal cost: $" + fltMealCostFinal);
    }
    
}
