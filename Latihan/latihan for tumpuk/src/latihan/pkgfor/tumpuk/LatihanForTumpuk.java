/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkgfor.tumpuk;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanForTumpuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    int gcd=1, k=2;
    System.out.print("Bilangan 1 = "); int n1 = input.nextInt();
    System.out.print("Bilangan 2 = "); int n2 = input.nextInt();
       while(k<=n1 && k<=n2){
           if (n1%k == 0 && n2%k == 0)
           gcd = k;
           k++;
           
        
    }System.out.println("GCD = "+gcd);
    }
    
}
