/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina060423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author HP
 */
public class Latihan10_2BukuAlamatExample {
    
    public static void main( String[] args ){
    BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
    String [] nama =new String[100];
    String [] alamat =new String[100];
    String [] telp =new String[100];
    String [] email =new String[100];

    //membuat 5 object StudentRecord
    Latihan10_1BukuAlamat namaRecord = new Latihan10_1BukuAlamat();
    for(int i=0; i<2; i++ ){
    System.out.print("Input Nama: ");
               try{
                nama[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }

    System.out.print("Input Alamat: ");
               try{
                alamat[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
    System.out.print("Input telpon: ");
               try{
                telp[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
    System.out.print("Input Email: ");
               try{
                email[i]=dataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        }
    for(int i=0; i<2; i++ ){
    namaRecord.setName(nama[i],i,alamat[i],telp[i],email[i]);
    System.out.println("===========================================");
    System.out.println("Nama                  :"+namaRecord.getName(i) );
    System.out.println("Alamat                :"+namaRecord.getAlamat(i) );
    System.out.println("Telepon               :"+namaRecord.getTelpon(i) );
    System.out.println("Email                 :"+namaRecord.getEmail(i) );
    System.out.println("===========================================");
    }

    System.out.println("\nTotal Jumlah Siswa ="+Latihan10_1BukuAlamat.getStudentCount());
    }
}
    

