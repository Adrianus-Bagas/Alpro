/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ganjil.genap;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int a,b;
    
    System.out.print("Angka = ");a= input.nextInt();
    
    b=a%2;
    
    if (b==0){
        System.out.println(a+" adalah bilangan genap");
    }else {
        System.out.println(a+" adalah bilangan ganjil");
                }
    }
    
    
    }
    

