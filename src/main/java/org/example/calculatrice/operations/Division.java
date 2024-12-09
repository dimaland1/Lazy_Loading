//Jalal Azouzout

package org.example.calculatrice.operations;

public class Division {
    public double calculer(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }
}
