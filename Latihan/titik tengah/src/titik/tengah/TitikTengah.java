/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titik.tengah;

/**
 *
 * @author ASUS
 */
public class TitikTengah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double mi=1,x=9,z,ym,total=0,k=1.05;
    double i;
    for(i=0;i<=x;i++){
        z=i*0.1;
            System.out.println("z = "+z);
        mi=k+z;
            System.out.println("mi = "+mi);
        ym=1/mi;
            System.out.println("ym = "+ym);
            
    total = total+ym;
    System.out.println("Total = "+total);
    }
    double b=2,a=1,n=10,hasil;
    hasil=(b/a)/n*(total);
    System.out.println("Hasil = "+hasil);
    }
    
}
