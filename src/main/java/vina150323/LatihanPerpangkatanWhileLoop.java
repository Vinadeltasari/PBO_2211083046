/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina150323;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LatihanPerpangkatanWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, pangkat, hasil=1;
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = input.nextInt();
        int i = 1;
        while (i <= pangkat) {
            hasil *= angka;
            i++;
        }
        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }

}
 