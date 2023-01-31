/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.loop.lanjutan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanLoopLanjutan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int i, j, sum = 0,n;
        System.out.print("n = "); n = input.nextInt();
        
        for(i=1; i<n; i++){
for(j=1; j<n; j++){
sum = sum + i + j;
System.out.println("Nilai Jumlah = " +sum);
System.out.print("Nilai i = "+i+" ");
System.out.println("Nilai j = " +j);
}
}
    }
    
}
