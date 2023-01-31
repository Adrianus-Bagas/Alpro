/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    /*int number, max = 0;
    System.out.println("End input number 0(null)");
    do {
        System.out.print("Input the number = "); number = input.nextInt();
        if (number>max)
            max = number;
        System.out.println("The maximum number is "+max);
    } while(number != 0);
            System.out.println("Max is "+max);
*/
    int i=1,n,sum=0;
    double rata2,angka;
    System.out.print("Banyak Data = "); n = input.nextInt();
    
    while (i<=n){
        System.out.print("Data = "); angka = input.nextInt();
        sum += angka;
        i++;
    }
    System.out.println("Total Data = "+sum);
    rata2 = sum/n;
    System.out.println("Rata-rata = "+rata2);
    
    
    
    
    }
    
    
    
}
