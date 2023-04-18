/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Laboratorios
 */
public class CentralBank {

    private double money;
    ArrayList<CommercialBank> banks;

    
    public CentralBank(double money, ArrayList<CommercialBank> banks) {
        this.money = money;
        this.banks = banks;
    }

    public CentralBank() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<CommercialBank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<CommercialBank> banks) {
        this.banks = banks;
    }

    @Override
    public String toString() {
        return "CentralBank{" + "money=" + money + ", banks=" + banks + '}';
    }

    public void lendMoney(double money, double borrowedmoney) {
        if (this.money < borrowedmoney) {
            System.out.println("-1");
        } else {
            this.money = this.money - borrowedmoney;
        }
        System.out.println(this.money);
    }

}
