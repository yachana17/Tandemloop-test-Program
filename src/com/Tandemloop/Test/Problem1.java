package com.Tandemloop.Test;



import java.util.Scanner;

public class Problem1 {

  static double calculator(double a, double b, String operation) {
     switch (operation.toLowerCase()) {
         case "add":
             return a + b;
         case "subtract":
             return a - b;
         case "multiply":
             return a * b;
         case "divide":
            
                 return a / b;
         default:
             throw new IllegalArgumentException("Invalid operation");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter operation (add, subtract, multiply, divide): ");
     String operation = sc.nextLine();
     System.out.print("Enter a: ");
     double a = sc.nextDouble();
     System.out.print("Enter b: ");
     double b = sc.nextDouble();
     sc.nextLine();  
     
     double result=calculator(a, b, operation);
     System.out.println(result);
     
     
     
 }
}
