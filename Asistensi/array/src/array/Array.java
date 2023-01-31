package array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /*int[]angka={15,25,30};
        for(int i : angka){
            System.out.print(i+" ");
        }
        int[]angka = new int[3];
        angka[0]=12;
        angka[1]=34;
        angka[2]=45;
        for(int i : angka){
            System.out.print(i+" ");
        }
        */
        System.out.print("Masukkan panjang array = ");
        Scanner baca = new Scanner (System.in);
        int panjang = baca.nextInt();
        int[]angka=new int[panjang];
        int a=0;
        while(a<panjang){
            System.out.print("Masukkan elemen ke "+(a+1)+" = ");
            angka[a]=baca.nextInt();
            a++;
        }
        System.out.print("Array = ");
        for(int i : angka){
            System.out.print(i+" ");
        }
    }
    
}
