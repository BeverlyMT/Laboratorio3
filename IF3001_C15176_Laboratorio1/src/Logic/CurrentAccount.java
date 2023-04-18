/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class CurrentAccount extends Account {

    private double interest;

    public CurrentAccount() {

    }

    public CurrentAccount(double interest, String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
        this.interest = interest;
    }

    public CurrentAccount(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterest;
        totalInterest = this.getInterest() * this.getBalance();
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
        super.setBalance(this.getBalance() + money);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + "interest=" + interest + '}';
    }
}
