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
public class CommercialBank {

    private String name;
    private double borrowedMoney;
    Account accounts[] = new Account[10];

    public CommercialBank() {

    }

    public CommercialBank(String name, double borrowedmoney) {
        this.name = name;
        this.borrowedMoney = borrowedmoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return borrowedMoney;
    }

    public void setMoney(double borrowedmoney) {
        this.borrowedMoney = borrowedmoney;
    }

    @Override
    public String toString() {
        return "CommercialBank{" + "name=" + name + ", money=" + borrowedMoney + '}';
    }

}//fin

