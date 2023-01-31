/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang.pkg2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bintang2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i=5;
    while (i>=1){
        for (int j=1;j<=i;j++){
            System.out.print(" x ");
        }
           System.out.println();
    i--;
    }
 
    /*Scanner input = new Scanner (System.in);
    int n;
    System.out.print("n = "); n = input.nextInt();
    System.out.print(n+" ");
    while (n>=0){
        if (n%2==0){
            n/=2;
            System.out.print(n+" ");
        }
        else {
            n-=1;
            n/=2;
            System.out.print(n+" ");
        }
        n--;
    }
    System.out.println();*/
    }
    
}
