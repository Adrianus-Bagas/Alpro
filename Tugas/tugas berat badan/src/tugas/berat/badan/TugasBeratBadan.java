/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.berat.badan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasBeratBadan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Berat (pon) = "); 
    double b = input.nextDouble();
    System.out.print("Tinggi (inci) = "); 
    double t = input.nextDouble();
    System.out.print("Tinggi (feet) = ");
    double f = input.nextDouble();
    
    final double kgp = 0.45359237;
    final double mpi = 0.0254;
    final double mpf = 0.3048;
    
    double bkg = b*kgp;
    double tm = (t*mpi)+(f*mpf);
    double bmi = bkg/(tm*tm);
    
    System.out.println("BMI = "+bmi);
    
    if (bmi<18.5){
        System.out.println("Kurus");
    } else if (bmi<25){
        System.out.println("Normal");
    } else if (bmi<30) {
        System.out.println("Gemuk");
    } else 
        System.out.println("Obesitas");
    }

    }
    

