/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pajak;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasPajak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    System.out.println("0. Single filer");
    System.out.println("1. Married Jointly or Qualifying Widow"); 
    System.out.println("2. Married Separately"); 
    System.out.println("3. Head of Household");
    System.out.print("Status = "); int status = input.nextInt();
    
    double income = 0;
    
    if (status==0){
        System.out.print("Taxable income = "); income = input.nextDouble();
    } else if (status==1){
        System.out.print("Taxable income = "); income = input.nextDouble();
    } else if (status==2){
        System.out.print("Taxable income = "); income = input.nextDouble();
    } else if (status==3){
        System.out.print("Taxable income = "); income = input.nextDouble();
    } else 
        System.out.print("Error : ");
    
    double tax = 0;
    if (status == 0) {
        if (income <= 8350) {
            tax = income*0.1;
        }else if (income<=33950){
            tax = 8350*0.1+(income-8350)*0.15;
        } else if (income<=82250){
            tax = 8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
        } else if (income<=171550){
            tax = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28;
        } else if (income<=372950){
            tax = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(income-171550)*0.33;
        } else 
            tax = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(income-372950)*0.35;
    } else if (status==1){
        if (income <= 16700) {
            tax = income*0.1;
        }else if (income<=67900){
            tax = 16700*0.1+(income-16700)*0.15;
        } else if (income<=137050){
            tax = 16700*0.1+(67900-16700)*0.15+(income-67900)*0.25;
        } else if (income<=208850){
            tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(income-137050)*0.28;
        } else if (income<=372950){
            tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
        } else 
            tax = 16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33+(income-372950)*0.35;
        
    } else if (status==2) {
         if (income <= 8350) {
            tax = income*0.1;
        }else if (income<=33950){
            tax = 8350*0.1+(income-8350)*0.15;
        } else if (income<=68525){
            tax = 8350*0.1+(33950-8350)*0.15+(income-33950)*0.25;
        } else if (income<=104425){
            tax = 8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(income-68525)*0.28;
        } else if (income<=186475){
            tax = 8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(income-104425)*0.33;
        } else 
            tax = 8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33+(income-186475)*0.35;
    } else if (status==3){
         if (income <= 11950) {
            tax = income*0.1;
        }else if (income<=45500){
            tax = 11950*0.1+(income-11950)*0.15;
        } else if (income<=117450){
            tax = 11950*0.1+(45500-11950)*0.15+(income-45500)*0.25;
        } else if (income<=190200){
            tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(income-117450)*0.28;
        } else if (income<=372950){
            tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-190200)*0.33;
        } else 
            tax = 11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(372950-190200)*0.33+(income-372950)*0.35;       
    } else 
        System.out.println(" Invalid status");
        
        System.out.println("Tax is " + (double)(tax*100)/100);  
}
}
