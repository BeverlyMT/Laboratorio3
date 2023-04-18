/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorios
 */
public abstract class Account extends CommercialBank {

    //Atributes 
    private String accountNumber;
    private Client client;

    public Account(String accountNumber, Client client, double balance, CommercialBank bank) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
        this.bank = bank;
    }

    public CommercialBank getBank() {
        return bank;
    }

    public void setBank(CommercialBank bank) {
        this.bank = bank;
    }
    private double balance;
    private CommercialBank bank;

    public Account(String accountNumber, Client client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public Account() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//methods in orde to represent polymorphism
    public abstract double interestCalculation();

    public abstract void withdraw(double money);

    public abstract void deposit(double money);

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", client=" + client + ", balance=" + balance + '}';
    }

    //Sinpe
    public void MakeSinpe(Account accountRecep, double money) {

        if (this.balance < money) {
            JOptionPane.showMessageDialog(null, "You don't have enough money", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            this.balance -= money; //Subtract the amount sent from the current account
            accountRecep.balance += money;//add the money to the recipient account
            System.out.println("Name:" + this.client.getName()
                    + "\n" + "Bank: " + bank.getName() + "\n" + "You send: $" + money + "\n"
                    + "Recipients acoount:" + accountRecep.client.getName()
                    + "\n" + "Recipient's Bank:" + accountRecep.bank.getName()
                    + "\n" + "Phone: " + accountRecep.client.getPhone());

        }
        System.out.println("" + this.client.getName() + " your current balances is: " + this.balance);
    }

} //final

