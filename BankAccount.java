/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Asus
 */
public class BankAccount implements BankAccountSpecification {
    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
            return true;
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
