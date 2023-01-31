/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapezoidal;

/**
 *
 * @author ASUS
 */
public class Trapezoidal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double i,xi,yi=0,wi=0,wiyi,luas,a,b,n,h,integral;
    luas=0;
    a=1;
    b=2;
    n=10;
    xi=a;
    h=(b/a)/n;
    for (i=0;i<=n;i++){
        if (i==0 || i==n){
            wi=1;
                yi=(1/xi);
                wiyi=wi*yi;
                luas=luas+wiyi;
        } else {
            wi=2;
            yi=(1/xi);
            wiyi=wi*yi;
            luas=luas+wiyi;
        }
        System.out.println("Nilai i adalah = "+i);
        System.out.println("Nilai xi adalah = "+xi);
        System.out.println("Nilai yi adalah = "+yi);
        System.out.println("Nilai wi adalah = "+wi);
        System.out.println("Nilai wiyi adalah = "+wiyi);
        System.out.println("______________________");
        xi=xi+h;
    }
    integral=luas*(b-a)/(2*n);
    System.out.println("Nilai integral adalah = "+integral);
    }
    
}
