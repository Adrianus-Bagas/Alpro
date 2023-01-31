package array.pkg2d;
import java.util.Arrays;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        /*int m[][]=new int[2][3];
        m[0][0]=1;
        m[0][1]=2;
        m[0][2]=3;
        m[1][0]=4;
        m[1][1]=5;
        m[1][2]=6;
        System.out.println("Matriks dengan nguli : ");
        System.out.println(m[0][0]+" "+m[0][1]+" "+m[0][2]);
        System.out.println(m[1][0]+" "+m[1][1]+" "+m[1][2]);
        System.out.println("Matriks 2x3 = ");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
                //if(j==m[0].length-1){
                //System.out.println(" ");
            }
            System.out.println();
        }
*/
        Scanner input=new Scanner(System.in);
        int two[][]=new int [2][2];
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("Masukkan elemen ke ("+(i+1)+","+(j+1)+") : ");
                int elemen=input.nextInt();
                two[i][j]=elemen;
            }
        }
        System.out.println("Matriksnya : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(two[i][j]+" ");
                if(j==1){
                    System.out.println();
                }
            }
        }
    }
}
