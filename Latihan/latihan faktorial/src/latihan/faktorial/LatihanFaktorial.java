/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.faktorial;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanFaktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int n, fak = 1, i = 1;
    System.out.print("n = "); n = input.nextInt();
    
    if (n==0) {
        fak = 1;
        System.out.println("Faktorial = "+fak);
    } else {
        while (i<=n) {
        fak = fak*i;
        i++;
        }
        System.out.println("Faktorial = "+fak);
        
        
        
    }
    }
}
   
    
    

