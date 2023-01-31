/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TUGAS {
    public static void main(String []args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("a= "); a= input.nextInt();
        System.out.print("b= "); b= input.nextInt();
        System.out.print("c= "); c= input.nextInt();
       
         double D;
       D = (b*b)-(4*a*c);
        
        
        if(D==0){
            System.out.println("Persamaan kuadrat ini memiliki akar kembar");
        }else if (D>0){
            System.out.println("Persamaan kuadrat ini memiliki akar real berbeda");
        } else {
            System.out.println("Persamaan kuadrat ini memiliki akar imajiner");
        
       
        //Tugas tahun kabisat
        /*int c,d;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun:");
        c= input.nextInt();
        
        d=c%4;
        if(d==0){
            System.out.println("Tahun " +c+ " merupakan tahun kabisat");
        }else{
            System.out.println("Tahun " +c+ " bukan merupakan tahun kabisat");}
    }*/
        /*int e;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomer bulan:");
        e=input.nextInt();
        switch(e){
            case 1: 
                System.out.println("Bulan ke "+e+" adalah Januari");
            break;
            case 2: 
                System.out.println("Bulan ke "+e+" adalah Februari");
            break;
            case 3: 
                System.out.println("Bulan ke "+e+" adalah Maret");
            break;
            case 4: 
                System.out.println("Bulan ke "+e+" adalah April");
            break;
            case 5: 
                System.out.println("Bulan ke "+e+" adalah Mei");
            break;
            case 6: 
                System.out.println("Bulan ke "+e+" adalah Juni");
            break;
            case 7: 
                System.out.println("Bulan ke "+e+" adalah Juli");
            break;
            case 8: 
                System.out.println("Bulan ke "+e+" adalah Agustus");
            break;
            case 9: 
                System.out.println("Bulan ke "+e+" adalah September");
            break;
            case 10: 
                System.out.println("Bulan ke "+e+" adalah Oktober");
            break;
            case 11: 
                System.out.println("Bulan ke "+e+" adalah November");
            break;
            case 12: 
                System.out.println("Bulan ke "+e+" adalah Desember");
            break;
            default: 
                System.out.println("Bulan ke "+e+" tidak ada dalam kalender");
        */
            
        }
        
            
        
    }
    
}
