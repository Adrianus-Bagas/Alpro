package pkgbreak.and.pkgcontinue;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int sum = 0, number = 0;
    
    while (number < 20){
        number++;
        sum += number;
        if (sum >= 100)
            break;
    }
    System.out.println("The number is "+number);
    System.out.println("The sum is "+sum);
    /*int sum = 0, number = 0;
    
    while (number<20){
        number++;
        if (number==10 || number==11 )
            continue;
        sum += number;
        System.out.println("The sum is "+sum);
    }*/
    
    }
    
}
