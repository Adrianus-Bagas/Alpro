/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    
    /*double i, jumlah;
    
    jumlah=0;
    
    i=1;
    
        while(i<11){
            jumlah = jumlah+1/(i*(i+1));
            System.out.println("Jumlah ke-"+i+" adalah = "+jumlah);
            i++;
        }*/
    double number, sum = 0, rata2;
    int i = 1;
    
   System.out.print("Banyak Data = "); int n = input.nextInt();
    while(i<=n){
           System.out.print(" Data = "); number = input.nextInt();
           sum = sum+number;
           i++;

    }
       System.out.println("Banyak Data = "+i);
          System.out.println("Jumlah = "+sum);
          rata2 = sum/n;
             System.out.println("Rata-Rata = "+rata2); 


    
    
    
    
    
    }
    
    
    
}
