package javaapplication68;
import java.util.Scanner;
public class Coba2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String []bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        String []hari = {"Mg","Sn","Sl","Rb","Km","Jm","Sb"};

        int []umurBulan = {31,29,31,30,31,30,31,31,30,31,30,31};

        int spasi=0;

        for(int b=0;b<12;b++)
        {

            System.out.println(bulan[b]);
            for(int h=0;h<7;h++)
            {
                System.out.print(hari[h]+"  ");
            }
            System.out.println();

            //tanggal
            //spasi
            for(int sps=1;sps<=spasi;sps++){
            System.out.print("   ");}

            for(int t=1;t<=(umurBulan[b]);t++)
            {
                if(t<=9){
                System.out.print(t+"   ");}
                else{System.out.print(t+"  ");}
                if(((t+spasi)%7)==0){
                    System.out.println();
                }
            }

            System.out.println();

        System.out.println("Input N key for next Month or Q for Quit");
        String input = sc.next();
        if(input.equals("N")){
            spasi = (spasi+(umurBulan[b]%7))%7;
        }
        if(input.equals("Q"))
        {b=11;}
        else{System.out.println("Masukkan anda salah, hanya N or Q");}

        System.out.println();
        System.out.println();
        }

    }
} 
    
    

