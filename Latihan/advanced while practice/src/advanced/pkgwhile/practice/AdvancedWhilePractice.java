/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.pkgwhile.practice;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class AdvancedWhilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i=1; double sum=0;
    while (i<=100){
        sum = sum+(1/(Math.pow(i, 10)*((Math.pow(i,10))+1)));
        i++;
    }
    System.out.println("Jumlah = "+sum);
    
    
}
}
