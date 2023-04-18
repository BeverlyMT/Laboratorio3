/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public class Client {

    private String id;
    private String name;
    private String adress;
    private String phone;
    private Account account;

    public Client() {
        int max=1;
    }

    public Client(String id, String name, String adress, String phone) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + '}';
    }//to string 

 
}//fin clase 
