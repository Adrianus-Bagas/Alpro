package xxx;
import java.util.Scanner;
public class Xxx {
    public static double luastabung(double r,double t ){
        double lpt;
        lpt=(2*r*t*22/7)+(2*r*r*22/7);
        return lpt;
    }
     public static double luasbalok(double p,double l, double t ){
        double lpb;
        lpb=(2*p*l)+(2*p*t)+(2*l*t);
        return lpb;
    }
      public static double luasbola(double r ){
        double lpbl;
        lpbl=4*r*r*22/7;
        return lpbl;
      }
      public static double volumetabung(double r,double t ){
        double vt;
        vt=r*r*t*22/7;
        return vt;
    }
       public static double volumebalok(double p,double l,double t ){
        double vb;
        vb=p*l*t;
        return vb;
    }
        public static double volumebola(double r ){
        double vbl;
        vbl=4*r*r*r*22/21;
        return vbl;
        }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double r,t,p,l,tb;
        System.out.println("1. Tabung");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.print("Pilih nomor : ");
        a=input.nextInt();
        switch(a){
            case 1 :
                System.out.println("1. Luas permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih nomor : ");
                b=input.nextInt();
                switch(b){
                    case 1 :
                        System.out.print("Jari-jari : ");
                        r=input.nextDouble();
                        System.out.print("Tinggi : ");
                        t=input.nextDouble();
                        double lpt=luastabung(r,t);
                        System.out.println("Luas Permukaan Tabung : "+lpt);
                    break;
                    case 2 : 
                        System.out.print("Jari-jari : ");
                        r=input.nextDouble();
                        System.out.print("Tinggi : ");
                        t=input.nextDouble();
                        double vt=volumetabung(r,t);
                        System.out.println("Volume Tabung : "+vt);
                    break;
                    default : 
                        System.out.println("Error");         
                }
            break;
            case 2 : 
                System.out.println("1. Luas permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih nomor : ");
                b=input.nextInt();
                switch(b){
                    case 1 :
                        System.out.print("Panjang : ");
                        p=input.nextDouble();
                        System.out.print("Lebar : ");
                        l=input.nextDouble();
                        System.out.print("Tinggi : ");
                        tb=input.nextDouble();
                        double lpb=luasbalok(p,l,tb);
                        System.out.println("Luas Permukaan Balok : "+lpb);
                    break;
                    case 2 : 
                        System.out.print("Panjang : ");
                        p=input.nextDouble();
                        System.out.print("Lebar : ");
                        l=input.nextDouble();
                        System.out.print("Tinggi : ");
                        tb=input.nextDouble();
                        double vb=volumebalok(p,l,tb);
                        System.out.println("Volume Balok : "+vb);
                    break;
                    default : 
                        System.out.println("Error");
                }
            break;
            case 3 :
                System.out.println("1. Luas permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih nomor : ");
                b=input.nextInt();
                switch(b){
                    case 1 :
                        System.out.print("Jari-jari : ");
                        r=input.nextDouble();
                        double lpbl=luasbola(r);
                        System.out.println("Luas Permukaan Bola : "+lpbl);
                    break;
                    case 2 : 
                        System.out.print("Jari-jari : ");
                        r=input.nextDouble();
                        double vbl=volumebola(r);
                        System.out.println("Volume Bola : "+vbl);
                    break;
                    default : 
                        System.out.println("Error");
                }
            break;
            default : 
                System.out.println("Error");
        }
    }    
}
