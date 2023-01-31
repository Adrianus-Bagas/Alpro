/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitunghari;

import java.util.Scanner;
 
/**...4 lines */ 
public class MenghitungHari {

    /*** @param args */
    public static void main(String[] args) 
    {   
            Scanner baca=new Scanner (System.in);
            
            String hariini;//input nama hariini
            String hariesok;//input prediksi hari
            
            System.out.print("masukkan tanggal anda sekarang : ");
            int sekarang;
            sekarang=baca.nextInt();
            
            System.out.print("masukkan tanggal yang akan diprediksi : ");
            int prediksi;
            prediksi = baca.nextInt();
            
            if (sekarang==0)
            {
                hariini="Minggu";
            }
            else if (sekarang==1)
            {
                hariini="Selasa";
            }
            else if (sekarang==2)
            {
                hariini="Rabu";
            }
            else if (sekarang==3)
            {
                hariini="Kamis";
            }
            else if (sekarang==4)
            {
                hariini="Jumat";
            }
            else if (sekarang==5)
            {
                hariini="Sabtu";
            }
            else
            {
                hariini="Senin";
            }
            //Hari digunakan untuk saat ini, hari esok untuk prediksi
            int kalhariesok=(sekarang+prediksi)%7;
             if (kalhariesok==0)
           {
               hariesok="Minggu";
           }
             else if (kalhariesok==1)
           {
               hariesok="Selasa";
           }
             else if (kalhariesok==2)
             {
               hariesok="Rabu";
           }
             else if (kalhariesok==3)
             {
               hariesok="Kamis";
           }
             else if (kalhariesok==4)
             {
               hariesok="Jummat";
           }
             else if (kalhariesok==5)
             {
               hariesok="Sabtu";
           }
             else 
             {
              hariesok="Senin";
             }
           System.out.println("Hari ini adalah "+hariini+"dan hari ke-"+prediksi+" adalah"+hariesok);
       
    
    }
    
}
