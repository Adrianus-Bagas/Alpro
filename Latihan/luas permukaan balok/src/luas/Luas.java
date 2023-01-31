/*
PROGRAM PERTAMAKU
 */
package luas;
import java.util.Scanner;
/*DARYONO KONTOL
 */
public class Luas {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*System.out.println("Hello, Saya lagi belajar pemrogaraman Java");
        System.out.println("Hari ini belajar luas");
        */
        
        Scanner panjang = new Scanner(System.in);
        double p = panjang.nextDouble();
        System.out.println("Panjang Balok = "+p);
        
         Scanner lebar = new Scanner(System.in);
        double lb = lebar.nextDouble();
        System.out.println("Lebar Balok = "+lb);
        
        Scanner tinggi = new Scanner (System.in);
        double t = tinggi.nextDouble();
        System.out.println("Tinggi Balok = "+t);
        double v; //bil. real
        v = p * lb * t;
        
        double l; //bil. real
        l = 2*p*lb + 2*lb*t + 2*p*t;
        
     
        //int panjang, lebar, luas; //int : bil. integer bulat positif
        //panjang = 8;
        //lebar = 7;
        //luas = panjang * lebar;
        
        System.out.println("Volume Balok = "+v);
        System.out.println("Luas permukaan = "+l);
    }
    
}
