/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.hari.bulan.tahun;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanHariBulanTahun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    System.out.print("Bulan = "); int kontol = input.nextInt();
    System.out.print("Tahun = "); int tahun = input.nextInt();
    
    int d=31;
    String m=null;
    
    if (kontol==1){
        m="Januari";
    }else if (kontol==2){
                if (tahun%4==0){
                    m="Februari";
                    d=29;
                } else 
                    m="Februari";
                    d=28;
    }else if (kontol==3){
        m="Maret";
    }else if (kontol==4){
        m="April";
        d=30;
    }else if (kontol==5){
        m="Mei";
    }else if (kontol==6){
        m="Juni";
        d=30;
    }
    else if (kontol==6){
        m="Juni";
        d=30;
    
    }else if (kontol==7){
        m="Juli";
    
    }else if (kontol==8){
        m="Agustus";
    
    }else if (kontol==9){
        m="September";
        d=30;
    
    }else if (kontol==10){
        m="Oktober";
       
    
    }else if (kontol==11){
        m="November";
        d=30;
    
    }else if (kontol==12){
        m="Desember";
       
    
    }else{
        m="Tidak Ada";
        d=0;
    }
      System.out.println("Bulan = "+m);
      System.out.println("Jumlah Hari = "+d);
    }
    
    
    }
    

