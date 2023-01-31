package tower.of.hanoi;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.print("Jumlah Piringan = ");
        int N=input.nextInt();
        System.out.println();
        hanoi(N,'a','b','c');
    }
    public static void hanoi(int n,char awal,char temp,char akhir){
        if(n==1){
            System.out.println("Pindahkan "+n+" dari "+awal+" ke "+akhir);
        } else {
            hanoi(n-1,awal,akhir,temp);
            System.out.println("Pindahkan "+n+" dari "+awal+" ke "+akhir);
            hanoi(n-1,temp,awal,akhir);
        }
    }
}
