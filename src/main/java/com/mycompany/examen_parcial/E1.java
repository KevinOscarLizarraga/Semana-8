/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_parcial;

import java.util.Scanner;

/* Lizarraga Paquiyauri Kevin */

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCantidad de numeros a sumar\n");
        int l = (int) sc.nextDouble();
        int S = 0;
        int f = 0;
        int g = 1;
        System.out.println(g);
        for (int i = 0; i < l; i++) {
            S = g + f;
            f = g;
            g = S;
            System.out.println(S);
        }
    }
}
