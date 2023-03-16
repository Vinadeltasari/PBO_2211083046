/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina150323;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author HP
 */
public class LatihanNilaiTerbesar {
    public static void main(String [] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        
        try
        {
           System.out.print("Entry nilai A : ");
           a = Integer.parseInt(dataIn.readLine());
           System.out.print("Entry nilai B: ");
           b = Integer.parseInt(dataIn.readLine());
           System.out.print("Entry nilai C : ");
           c = Integer.parseInt(dataIn.readLine());
           
           int max = 0;
           if(a>max){
               max = a;
           }
           if (b > max){
               max = b;
           }
           if (c > max){
               max = c;
           }
           
           System.out.println("Nilai terbesar : "+max);
        }catch (Exception ex){
           }
               
        }
    }
 