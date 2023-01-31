/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang;

/**
 *
 * @author ASUS
 */
public class Bintang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int jum=0;
       int total=0;
       
       for (int count=5;count<=20;count++){
           if((count%3==0)||(count%2!=0)){
               System.out.println("%d"+count);
               jum++;
               total+=count;
           }
       }
       System.out.println("Jumlah Bilangan = "+jum);
       System.out.println("Total Bilangan = "+total);
    }
    
}
