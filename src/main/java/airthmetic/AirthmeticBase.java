/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airthmetic;

/**
 *
 * @author Aarushi
 */
public class AirthmeticBase {
    public double calculate(OperationType operation, int m, int n) {
        switch (operation) {
            case PLUS:
                return m + n;
            case MINUS:
                return m - n;
            case TIMES:
                return m * n;
            case DIVIDES:
                if (n != 0) {
                    return (double) m / n;
                } else {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    } 
}
