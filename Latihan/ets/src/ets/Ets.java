/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ets;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    int a,n;
    
    System.out.print("Batas bawah = ");a = input.nextInt();
    System.out.print("Batas atas = ");n = input.nextInt();
    
    while (a<=n){
        if ((a%2!=0)&&(a%5!=0)){
            System.out.print(a+" ");
        }
        a++;
    }
     System.out.println();
    }
    
}
