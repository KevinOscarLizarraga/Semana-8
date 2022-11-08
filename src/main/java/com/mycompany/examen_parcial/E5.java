/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_parcial;

/* Lizarraga Paquiyauri Kevin */

public class E5 {
    public static void main(String[] args) {
        System.out.println("\n Recibo de luz \n");
        double cargo = Math.random()*(10);
        double Cargo = Math.random()*(5);
        double Energia = 0.9848 * Math.random()*(100+70);
        double Publico = 0.8617 * Math.random()*(10+1);
        double Subt = (cargo+Cargo+Energia+Publico);
        double Igv = (Subt) * 8/100;
        double d1 = Math.random()*(20+10);
        double d2 = Math.random()*(1+0.10);
        double d3 = Math.random()*(020);
        double d4 = Math.random()*(0.15);
        double d5 = Math.random()*(5);
        double Total = Subt+Igv-d1+d2+d3+d4+d5;
        System.out.println("\n Cargo Fijo : "+ cargo +
                "\n Cargo por Reposición y Mantenimiento de la Cone : "+Cargo+
                "\n Energia Activa : "+ Energia+
                "\n Alumbrado Público : "+ Publico +
                "\n SUB TOTAL : "+Subt+
                "\n IGV" + Igv+
                "\n Cargo Energia Ley MCTER 30468 : " + d1
                + "\n Cargo Fijo Ley MCTER 30468 : " + d2
                + "\n Saldo por redondeo : " + d3
                + "\n Redondeo : " + d4
                + "\n Aporte Ley Nro. 28749 0.0092 : " + d5);
        System.out.println("\n Total a Pagar : " + Math.round(Total));
    }
}
