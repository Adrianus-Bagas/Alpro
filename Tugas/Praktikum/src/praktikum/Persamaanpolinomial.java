package praktikum;
import java.util.Scanner;
public class Persamaanpolinomial {
public static void main(String[] args) {

int a,b,c;
double d,e,f,g,x1,x2;

Scanner input = new Scanner(System.in);
System.out.println("Masukkan nilai a = ");
a = input.nextInt();
System.out.println("Masukkan nilai b = ");
b = input.nextInt();
System.out.println("Masukkan nilai c = ");
c = input.nextInt();

d = Math.pow(b,2)-(4*a*c);
e = b/(4*a);
f = -d/(4*a);
g = f;

x1 = (-b+(Math.sqrt(d)))/(2*a);
x2 = (-b-(Math.sqrt(d)))/(2*a);

if(a>0){
    System.out.println("Cekung ke Atas");
if(a<0){
    System.out.println("Cekung ke Bawah");   
    }
}
System.out.println("Persamaan polinomial " +a+ " x^2 +" +b+ "x + " +c);
System.out.println("Nilai Diskriminan = "+d);
System.out.println("Titik Stasioner = " +e+ "dan " +f);
System.out.println("Nilai akar akar persamaan adalah = "+x1+ "dan " +x2);
System.out.println("Nilai Minimum Lokal adalah = "+g);

}    
}