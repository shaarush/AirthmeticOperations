/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airthmetic; 
import java.util.Scanner; 

/**
 *
 * @author Aarushi
 */
public class Airthmetic { 
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = in.nextInt();

        System.out.print("Enter second number: ");
        int m = in.nextInt();

        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDES): ");
        String operationInput = in.next().toUpperCase();

        OperationType operation;
        try {
            operation = OperationType.valueOf(operationInput);
            double result = r.calculate(operation, m, n);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation input. Please enter one of the following: PLUS, MINUS, TIMES, DIVIDES.");
        }
    }
    
}
