package metode;
import java.util.Scanner;
public class Metode {
   public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c,d,e,f;
        System.out.print("Batas awal 1 = "); a = input.nextInt();
        System.out.print("Batas awal 2 = "); b = input.nextInt();
        System.out.print("Batas awal 3 = "); c = input.nextInt();
        
        System.out.print("Batas akhir 1 = "); d = input.nextInt();
        System.out.print("Batas akhir 2 = "); e = input.nextInt();
        System.out.print("Batas akhir 3 = "); f = input.nextInt();

        System.out.println("Jumlah a-d = "+sum(a,d));
        System.out.println("Jumlah b-e = "+sum(b,e));
        System.out.println("Jumlah c-f = "+sum(c,f));
    }
    public static int sum(int i1, int i2){
        int result=0;
        for(int i=i1;i<=i2;i++)
            result+=i;
            return result;
    }
    
}
