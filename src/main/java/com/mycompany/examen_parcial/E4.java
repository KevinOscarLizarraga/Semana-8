/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_parcial;

import java.util.Scanner;

/* Lizarraga Paquiyauri Kevin */

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Numeros a Sumar \n");
        double r = (int) sc.nextDouble();
        System.out.println("\n --------- \n");
        int cont = 0;
        double s = 0; 
        double t = 0;
        for (int i = 0; i < r; i++) {
            int ni = (int) sc.nextDouble();
            cont = cont + 1;  
            s = s + ni;           
        }
        t = s/cont;
        System.out.println("\n Promedio \n" + t);
    }
}
