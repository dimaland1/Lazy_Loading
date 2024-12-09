//Jalal Azouzout

package org.example.calculatrice;

import org.example.calculatrice.operations.Addition;
import org.example.calculatrice.operations.Division;
import org.example.calculatrice.operations.Multiplication;
import org.example.calculatrice.operations.Soustraction;

public class LazyCalculatrice {
    private static Addition addition;
    private static Soustraction soustraction;
    private static Multiplication multiplication;
    private static Division division;

    public double calculer(String operation, double a, double b) {
        switch (operation.toLowerCase()) {
            case "addition":
                return getAdditionInstance().calculer(a, b);
            case "soustraction":
                return getSoustractionInstance().calculer(a, b);
            case "multiplication":
                return getMultiplicationInstance().calculer(a, b);
            case "division":
                return getDivisionInstance().calculer(a, b);
            default:
                throw new IllegalArgumentException("Opération non prise en charge: " + operation);
        }
    }

    private static Division getDivisionInstance() {
        if (division == null) {
            division = new Division();
        }
        return division;
    }

    private static Multiplication getMultiplicationInstance() {
        if (multiplication == null) {
            multiplication = new Multiplication();
        }
        return multiplication;
    }

    private static Soustraction getSoustractionInstance() {
        if (soustraction == null) {
            soustraction = new Soustraction();
        }
        return soustraction;
    }

    private static Addition getAdditionInstance() {
        if (addition == null) {
            addition = new Addition();
        }
        return addition;
    }
}
