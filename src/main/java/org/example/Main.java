//Jalal Azouzout

package org.example;

import org.example.calculatrice.Calculatrice;

public class Main {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Addition: " + calculatrice.calculer("addition", 5, 3));
        System.out.println("Multiplication: " + calculatrice.calculer("multiplication", 5, 3));
    }}