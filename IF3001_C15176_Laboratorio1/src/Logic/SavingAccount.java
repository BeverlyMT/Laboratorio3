/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class SavingAccount extends Account {

    //Atributes
    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount(String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
    }

    public SavingAccount() {
    }

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterest;
        totalInterest = this.getMonthlyTerm() * this.getInterest() * this.getBalance();
        return this.getBalance() + totalInterest;

    }

    @Override
    public void withdraw(double money) {
        if (money > this.getBalance()) {
            System.out.println("You dont have enough money");
        } else {
            super.setBalance(this.getBalance() - money);
            System.out.println(money + "has been withdraw");
        }

    }

    @Override
    public void deposit(double money) {
        this.setBalance(this.getBalance() + money);
    }

    @Override
    public String toString() {
        return super.toString() + "SavingAccount{" + "date=" + date + ", monthlyTerm=" + monthlyTerm + ", interest=" + interest + '}';
    }

}
