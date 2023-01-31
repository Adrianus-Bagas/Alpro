package call.swap;
import java.util.Scanner;
public class CallSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan Bilangan 1 = "); a = input.nextInt();
        System.out.print("Masukkan Bilangan 2 = "); b = input.nextInt();
        System.out.println("Sebelum penukaran, Bilangan 1 = "+a+" dan Bilangan 2 = "+b);
        swap(a,b);
        System.out.println("Setelah ditukar lagi, Bilangan 1  = "+a+" dan Bilangan 2 = "+b);
    }
    public static void swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("Setelah penukaran, Bilangan 1 = "+x+" dan Bilangan 2 = "+y);
    }
}
