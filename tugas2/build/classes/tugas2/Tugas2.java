/*

 */
package tugas2;
import java.util.Scanner;
/*DARYONO
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int rb, rt, t ;
        
        System.out.print("Jari-Jari Bola = "); rb = input.nextInt();
        System.out.print("Jari-Jari Tabung = "); rt = input.nextInt();
        System.out.print("Tinggi Tabung = "); t = input.nextInt();
        
        
        double vb;
        vb = 4*rb*rb*rb*22/21;
        
        double lb;
        lb = 4*rb*rb*22/7;
        
        double vt;
        vt = rt*rt*t*22/7;
        
        double lt;
        lt = 2*rt*rt*22/7 + 2*rt*t*22/7;
        
       
                
        System.out.println("Volume Bola = "+vb);
        System.out.println("Luas Permukaan Bola = "+lb);
        System.out.println("Volume Tabung = "+vt);
        System.out.println("Luas Permukaan Tabung = "+lt); 
   
    }
    
}
