/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
/**
 *
 * @author Asus
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BankAccount b = new BankAccount();

        b.deposit(10010);
        b.withdraw(5010);
        b.withdraw(8010);
        b.deposit(2001);

        System.out.println("Current balance: " + b.getBalance());
    }    }
    

