/*

 */
package tugas4;
import java.util.Scanner;
/*DARYONO
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c1, r2, f3, k4 ;
        
        System.out.print("Celcius = "); c1 = input.nextInt();
        
        
        double r1;
        r1 = c1*4/5;
        
        double f1;
        f1 = c1*9/5+32;
        
        double k1;
        k1 = c1 +273;
                
        System.out.println("Reamur = "+r1);
        System.out.println("Fahrenheit = "+f1);
        System.out.println("Kelvin = "+k1);
        
        System.out.print("Reamur = "); r2 = input.nextInt();
        
        double c2;
        c2 = r2*5/4;
        
        double f2;
        f2 = r2*9/4 + 32;
        
        double k2;
        k2 = c2 + 273;
        
        System.out.println("Celcius = "+c2);
        System.out.println("Fahrenheit = "+f2);
        System.out.println("Kelvin = "+k2);
        
        System.out.print("Fahrenheit = "); f3 = input.nextInt();
        
        double c3;
        c3 = (f3-32)*5/9;
        
        double r3;
        r3 = (f3-32)*4/9;
        
        double k3;
        k3 = c3+273;
        
         System.out.println("Celcius = "+c3);
        System.out.println("Reamur = "+r3);
        System.out.println("Kelvin = "+k3);
        
        System.out.print("Kelvin = "); k4 = input.nextInt();
        
        double c4;
        c4 = k4-273;
        
        double r4;
        r4 = c4*4/5;
        
        double f4;
        f4 = c4*9/5 + 32;
        
         System.out.println("Celcius = "+c4);
        System.out.println("Reamur = "+r4);
        System.out.println("Fahrenheit = "+f4);
        
   
    }
    
}
