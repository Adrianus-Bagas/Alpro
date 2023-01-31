package fungsi.rekursif;
import java.util.Scanner;
public class FungsiRekursif {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.print("Enter the number whose factorial to be found : ");
        int n=input.nextInt();
        int result=factorial(n);
        System.out.println("The factorial of "+n+" is "+result);
    }
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
