package metode.max;
import java.util.Scanner;
public class MetodeMax {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int a,b,c;
        System.out.print("Angka 1 = "); a = input.nextInt();
        System.out.print("Angka 2 = "); b = input.nextInt();
        System.out.print("Angka 3 = "); c = input.nextInt(); 
        System.out.println("Bilangan terbesar =  "+max(a,b,c));
    }
    public static int max(int i1,int i2,int i3){
        int maks,temp;
        if (i1>i2){
            temp=i1;
        } else 
            temp=i2;
        if (temp>i3){
            maks=temp;
        } else 
            maks=i3;
        return maks;
    }    
}


