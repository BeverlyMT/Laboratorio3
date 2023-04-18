/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author Laboratorios
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class ArrayListEjemplos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList miArreglo= new ArrayList();
        miArreglo.add("Hola");
         miArreglo.add(12);
          miArreglo.add(0.5);
        for(int i= 0; i<miArreglo.size();i++){
        System.out.println(miArreglo.get(i));
           }
           
           miArreglo.add(1, "segundo Hola"); 
          for(int i= 0; i<miArreglo.size();i++){
        System.out.println(miArreglo.get(i));
           }
          ArrayList<Integer>array2= new ArrayList();
          array2.add(10);
          array2.add(20);
          array2.add(30);
          System.out.println("Forma Clásica");
          for(int i= 0; i<array2.size();i++){
        System.out.println(array2.get(i));
           }
          System.out.println("Foreach");
            for(int x: array2){
                System.out.println(x);
            }
            System.out.println(" Forma Iterador");
            Iterator it= array2.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
             int a[]= {8,4,6,2};
            System.out.println(Arrays.toString(a));
            Burbuja(a);
             System.out.println(Arrays.toString(a));
    }
    public static void Burbuja(int a[]){
   
    int temp;
    for(int i=0; i<a.length-1; i++){
      for(int j=0; j<a.length-1; j++){
       if(a[j]>a[j+1]){
       temp=  a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
       } 
      }
    }
  }//burbuja
    
}
