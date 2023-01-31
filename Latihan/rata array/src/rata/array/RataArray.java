package rata.array;
import java.util.Scanner;
public class RataArray {
    public static void main(String[] args) {
    double[]numbers=new double [10];
    double sum=0;
    Scanner input = new Scanner(System.in);
    for (int i=0;i<numbers.length;i++){
        System.out.print("Masukkan Nilai ke-"+(i+1)+"=");
         double a = input.nextDouble();
         sum+=a;
    }
        double rata2 = sum/10;
        System.out.println("Rata-rata = "+rata2);
    }
}
