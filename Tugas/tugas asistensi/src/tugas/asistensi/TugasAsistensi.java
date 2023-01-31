/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.asistensi;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TugasAsistensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int a,b,c;    
    System.out.print("a = "); a=input.nextInt();
    System.out.print("b = "); b=input.nextInt();
    System.out.print("c = "); c=input.nextInt();
    if(a==0){
        System.out.println("Nilai a tidak boleh 0");
    } else if(b==0&&c==0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2 memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if (b==0&&c>0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2+"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
    
} else if(b==0&&c<0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if(c==0&&b>0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2+"+b+"x memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if(c==0&&b<0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2"+b+"x memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if (b>0&&c>0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2+"+b+"x+"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if (b>0&&c<0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2+"+b+"x"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if (b<0&&c>0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2-"+b+"x+"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
} else if (b<0&&c<0){
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("Polinomial "+a+"x^2-"+b+"x-"+c+" memiliki :");
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);
              
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.sqrt(Math.abs(D))/(2*a);
              System.out.println("2.Akar-akar dari polinomial = "+x11+"+"+d1+"i"+" dan "+x11+"-"+d1+"i");
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    
    double kc;
    kc=2*a;
    
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
    
    if (x>y){
        System.out.println("5.Nilai minimum lokal = "+y);
    } else {
        System.out.println("5.Nilai minimum lokal = "+x);
    }
}
}
}
