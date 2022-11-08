/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_parcial;

import java.util.Scanner;

/* Lizarraga Paquiyauri Kevin */

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLados iguales\n");
        int a = (int) sc.nextDouble();
        System.out.println("\nBase\n");
        int b = (int) sc.nextDouble();
        double s = 0;
        s = (a*a)-((b*b)/4);
        double h = Math.sqrt(s);
        double A = h * b/2;
        System.out.println("\n Area \n" + A);
    }
}
