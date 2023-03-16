/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class GetInputFromKeyboard {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        int nilai = 0;
        
        try{
            System.out.print("Please enter your name : ");
            name = dataIn.readLine();
            System.out.print("Nilai matematika : ");
        }
        catch (IOException e){
            System.out.println("Eror!");
        }
        System.out.println("Hell "+name+"!");
        System.out.print("Nilai matematika : "+nilai);
        }
    }
    
