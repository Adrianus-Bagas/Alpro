/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohswitch;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Contohswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int pil;
    
    System.out.println("1. Luas Persegi Panjang ");
    System.out.println("2. Luas Segi Tiga ");
    System.out.println("3. Luas Lingkaran");
    System.out.print("Pilihan =  "); pil = input.nextInt();
            
    switch(pil) {
        case 1 :
            System.out.print("Panjang = "); int p = input.nextInt();
            System.out.print("Lebar = "); int l = input.nextInt();
            
            double L;
            L = p*l;
            
            System.out.println("Luas = "+L);
        break;
        
        case 2 :
            System.out.print("Alas = "); int a = input.nextInt();
            System.out.print("Tinggi = "); int t = input.nextInt();
            
            double L1;
            L1 = a*t/2;
            
            System.out.println("Luas = "+L1);
        break;
        
        case 3 :
            System.out.print("Jari-Jari = "); int r = input.nextInt();
            
            final double phi = 3.14;
            
            double L2;
            L2 = phi*r*r;
            
            System.out.println("Luas = "+L2);
        break;
        default:
            System.out.println("Tidak Ada");
        
    }
    
    /*
    switch(hari){
        case 0:
            System.out.println("Minggu");
        break;
        
        case 1:
           System.out.println("Senin");
        break;
        
        case 2:
            System.out.println("Selasa");
        break;
        
        case 3:
            System.out.println("Rabu");
        break;
        
         case 4:
            System.out.println("Kamis");
        break;
        
         case 5:
            System.out.println("Jumat");
        break;
        
         case 6:
            System.out.println("Sabtu");
        break;
        default: 
                System.out.println("Tidak ada");
    }*/
    
    
    
    
    
    
    
    
    }
    
}
