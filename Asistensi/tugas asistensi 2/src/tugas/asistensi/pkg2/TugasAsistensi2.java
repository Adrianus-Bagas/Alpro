package tugas.asistensi.pkg2;
import java.util.Scanner;
public class TugasAsistensi2{
    public static double keliling(double r){
       double ka;
       ka=2*r*22/7;  
       return ka;
    }
    public static double luasalas(double r){
        double la;
        la=r*r*22/7;
        return la;
    }
    public static double luastabung(double r,double t){
        double lp;
        lp=(2*r*t*22/7)+(2*r*r*22/7);
        return lp;
    }
    public static double volume(double r,double t){
        double v;
        v=r*r*t*22/7;
        return v;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int r,t;
        System.out.println("Menghitung Keliling Alas, Luas Alas, Luas Permukaan Tabung, dan Volume Tabung");
        System.out.print("Jari-Jari Tabung : ");
        r=input.nextInt();
        System.out.print("Tinggi Tabung : ");
        t=input.nextInt();
        double ka=keliling(r);
        double la=luasalas(r);
        double lp=luastabung(r,t);
        double v=volume(r,t);
        System.out.println("Keliling Alas : "+ka);
        System.out.println("Luas Alas : "+la);
        System.out.println("Luas Permukaan Tabung : "+lp);
        System.out.println("Volume Tabung : "+v);
    }
}
