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
public class LatihanPerpangkatanForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, pangkat, hasil=1;
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = input.nextInt();
        for (int i=1; i<=pangkat; i++) {
            hasil *= angka;
        }
        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
    
}
