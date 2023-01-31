/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.angka;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int n;
    
    System.out.print("Nilai = "); n = input.nextInt();
    
    if (n>=101){
        System.out.println(n+" tidak ada nilai hurufnya");
    }else {
    if (n>=86){
        System.out.println(n+ " memiliki nilai huruf A");
    }else {
    if (n>=76){
        System.out.println(n+" memiliki nilai huruf AB");
    } else {
    if (n>=66){
        System.out.println(n+" memiliki nilai huruf B");
    } else {
    if (n>=61){
        System.out.println(n+" memiliki nilai huruf BC");
    } else {
    if (n>=56){
        System.out.println(n+ " memiliki nilai huruf C");
    } else {
    if (n>=41){
        System.out.println(n+ " memiliki nilai huruf D");
    } else {
    if (n>=0){
        System.out.println(n+ " memiliki nilai huruf E");
    } else{
        System.out.println(n+ " tidak ada nilai hurufnya");
        
    }
    }
    }
    }
    }
    }
    }
    }
    }
}
    
    
    
    
    
    
    
    

