/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Logic.Account;
import Logic.CentralBank;
import Logic.Client;
import Logic.CommercialBank;
import Logic.SavingAccount;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLogTest {

    public void test() {
        Client clients[] = new Client[10];

        clients[0] = new Client("3344994", "Luis", "Turrialba", "56453423");
        clients[1] = new Client("30547002", "Maria", "Turrialba", "88769876");
        Date date = new Date(2022, 3, 1);
        float currentInterest = (float) (0.02);

        Account accounts[] = new Account[10];

//create a commercial bank and then create accounts in these
        CommercialBank com1 = new CommercialBank("BCR", 230000);
        CommercialBank com2 = new CommercialBank("BAC", 30000);

        //Accounts
        accounts[0] = new Account("1234", clients[0], 5000, com1) {
            @Override
            public double interestCalculation() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void withdraw(double money) {

            }

            @Override
            public void deposit(double money) {

            }
        };

        // Account 2
        accounts[1] = new Account("1235", clients[1], 2000, com1) {
            @Override
            public double interestCalculation() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void withdraw(double money) {

            }

            @Override
            public void deposit(double money) {

            }
        };

        //sinpe test 
        accounts[0].MakeSinpe(accounts[1], 1500);
        System.out.println("");

        //Bank Simualation
        TransactionLog t1[] = new TransactionLog[5];
        accounts[0].withdraw(3400);
        t1[0] = new TransactionLog("Withdraw", accounts[0], 250000);

        for (int i = 0; i < t1.length; i++) {
            if (t1[i] != null) {
                System.out.println(t1[i]);
            }
        }

    }
}
