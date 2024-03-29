/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vina120423;

/**
 *
 * @author HP
 */
public class Person {
    protected String name; // protected bisa diturunkan langsung pada subclass nya
    protected String address;

    public Person() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { // public final String getName() ketika class final, maka class tidak boleh diturunkan(tidak bisa menggunakan override)
        System.out.println("getName Person");
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
}

    
