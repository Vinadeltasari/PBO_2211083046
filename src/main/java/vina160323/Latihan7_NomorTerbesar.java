/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina160323;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Latihan7_NomorTerbesar {
     public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i+1));
            double number = Double.parseDouble(input);
            numbers[i] = number;
        }

        double maxNumber = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah: " + maxNumber);
    }
}
