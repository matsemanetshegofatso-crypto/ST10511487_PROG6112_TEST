/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ONE {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Single-dimensional array holding the city names
        String[]cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
       
        // Single-dimensional array holding the console names
        String [] consoles = {"PS5", "XBOX", "SWITCh"};
        int[] cityTotals = new int [cities.length];
        
        int[][] sales = {
            {1000, 2000, 3000}, //Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
   // Calculating total sales for the cities
   for (int i = 0; i < cities.length; i++){
       for (int j = 0; j < consoles.length; j++){
           cityTotals[i] += sales [i][j];
       }
   }
    
   //Finding the city with more console sales
   int topIndex = 0;
   for (int i = 1; i < cityTotals.length; i++){
       if ( cityTotals[i] > cityTotals[topIndex]){
           topIndex = i;
       }
   }
   //The report
        System.out.println("=========== NUMBER 1 ELECTRONICS ===========");
        System.out.printf("%-16s", "City");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.printf("%-10s%n", "TOTAL");
        System.out.println("------------------------------------------------------------------");
 
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.printf("%-10d%n", cityTotals[i]);
        }
 
        System.out.println("------------------------------------------------------------------");
        System.out.println("City with the most sales: "
                + cities[topIndex] + " (" + cityTotals[topIndex] + " units)");
    }
}
