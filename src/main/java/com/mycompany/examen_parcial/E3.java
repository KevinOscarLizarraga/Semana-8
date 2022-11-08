/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_parcial;

import java.util.Scanner;

/* Lizarraga Paquiyauri Kevin */

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Radio \n");
        double r = (int) sc.nextDouble();
        double V = Math.PI*(4/3)*r*r*r;
        System.out.println("\n Volumen \n" + V);
    }
}
