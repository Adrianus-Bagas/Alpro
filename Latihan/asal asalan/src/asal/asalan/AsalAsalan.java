/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asal.asalan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class AsalAsalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    double jumlah = 0, data, rata2;
    int i =1,n ;
    System.out.print("Banyak Data = "); n = input.nextInt();
    while(i<=n){
        System.out.print("Data = "); data = input.nextInt();
        jumlah = jumlah+data;
        i++;
    }
    System.out.println("Total Data = "+jumlah);
    rata2 = jumlah/n;
    System.out.println("Rata-rata = "+rata2);
    }
    
}
