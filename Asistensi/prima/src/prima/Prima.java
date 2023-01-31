package prima;
import java.util.Scanner;
public class Prima {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Masukkan angka : "); n=input.nextInt();
        for(int i=2;i<n;i++){
            boolean prima=true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    prima=false;
                    break;
            }
            if(prima==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
}
}
