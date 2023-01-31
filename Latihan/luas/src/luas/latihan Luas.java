/*
PROGRAM PERTAMAKU
 */
package luas;
import java.util.Scanner;
/*DARYONO
 */
public class Luas {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*System.out.println("Hello, Saya lagi belajar pemrogaraman Java");
        System.out.println("Hari ini belajar luas");
        */
        
        Scanner panjang = new Scanner(System.in);
        double p = panjang.nextDouble();
        System.out.println("Panjang persegi = "+p);
        
         Scanner lebar = new Scanner(System.in);
        double lb = lebar.nextDouble();
        System.out.println("Lebar persegi = "+lb);
        
        double luas; //bil. real
        luas = p * lb;
        
        //int panjang, lebar, luas; //int : bil. integer bulat positif
        //panjang = 8;
        //lebar = 7;
        //luas = panjang * lebar;
        
        System.out.println("Luas persegi panjang = "+luas);
    }
    
}
