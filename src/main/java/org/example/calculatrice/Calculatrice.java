//Jalal Azouzout

package org.example.calculatrice;


import org.example.calculatrice.operations.Addition;
import org.example.calculatrice.operations.Division;
import org.example.calculatrice.operations.Multiplication;
import org.example.calculatrice.operations.Soustraction;

public class Calculatrice {
    public double calculer(String operation, double a, double b) {
        switch (operation.toLowerCase()) {
            case "addition":
                return new Addition().calculer(a, b);
            case "soustraction":
                return new Soustraction().calculer(a, b);
            case "multiplication":
                return new Multiplication().calculer(a, b);
            case "division":
                return new Division().calculer(a, b);
            default:
                throw new IllegalArgumentException("Opération non prise en charge: " + operation);
        }
    }
}
