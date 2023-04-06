/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina050423;

/**
 *
 * @author HP
 */
public class StudentRecordExample {
    public static void main (String args []) {
        StudentRecord annaRecord = new StudentRecord(); 
        StudentRecord crisRecord = new StudentRecord(); 
        
        //Memasukkan Record 
        annaRecord.setName("Anna"); 
        annaRecord.setAddress("Arendalle");
        annaRecord.setAge(15);
        annaRecord.setEnglishGrade(90);
        annaRecord.setMathGrade(80);
        annaRecord.setScienceGrade(80);
        
        crisRecord.setName("Chris"); 
        crisRecord.setAddress("Ohio");
        crisRecord.setAge(17);
        crisRecord.setEnglishGrade(70);
        crisRecord.setMathGrade(85);
        crisRecord.setScienceGrade(75);
        
        //Menampilkan Record
        System.out.println("Nama    : " + annaRecord.getName() );
        System.out.println("Alamat  : " + annaRecord.getAddress() );
        System.out.println("Umur    : " + annaRecord.getAge() );
        System.out.println("Nilai Bahasa Inggris    : " + annaRecord.getEnglishGrade() );
        System.out.println("Nilai Matematika        : " + annaRecord.getMathGrade() );
        System.out.println("Nilai IPA               : " + annaRecord.getScienceGrade() );
        System.out.println("Rata-Rata Nilai         : " + annaRecord.getAverage() );   
        
        
        
        System.out.println("Nama    : " + crisRecord.getName() );
        System.out.println("Alamat  : " + crisRecord.getAddress() );
        System.out.println("Umur    : " + crisRecord.getAge() );
        System.out.println("Nilai Bahasa Inggris    : " + crisRecord.getEnglishGrade() );
        System.out.println("Nilai Matematika        : " + crisRecord.getMathGrade() );
        System.out.println("Nilai IPA               : " + crisRecord.getScienceGrade() );
        System.out.println("Rata-Rata Nilai         : " + crisRecord.getAverage() );
        
        
        
        StudentRecord aliRecord = new StudentRecord(); 
        aliRecord.setName("Ali"); 
        aliRecord.setAddress("Cairo");
        aliRecord.setAge(20);
        
        aliRecord.print("");
        aliRecord.print(60,70,80);
        
        //System.out.print("Count = " + StudentRecord.getStudentCount());
    }
}
