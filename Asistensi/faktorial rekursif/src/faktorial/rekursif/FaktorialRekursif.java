package faktorial.rekursif;
import java.util.Scanner;
public class FaktorialRekursif {
    public static long faktorial(long num){
        if(num==0){
            return 1;
        } else {
        return num*faktorial(num-1);
    }
    }
    public static void main(String[] args) {
    long hasil;
    int bil;
    Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        bil=scan.nextInt();
        hasil=faktorial(bil);
        System.out.println("Faktorial dari "+bil+" adalah "+hasil);
    }  
}
