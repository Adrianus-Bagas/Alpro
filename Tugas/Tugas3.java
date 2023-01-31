/*

 */
package tugas3;
import java.util.Scanner;
/*DARYONO
 */
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int detik ;
        
        System.out.print("Detik = "); detik = input.nextInt();
        
        
        double menit;
        menit = detik/60;
        
        double jam;
        jam = menit/60; 
                
        System.out.println("Menit = "+menit);
        System.out.println("Jam = "+jam);
   
    }
    
}
