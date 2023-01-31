package tugas.asistensi.pkg3;
import java.util.Scanner;
public class tugasasistensi3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Baris Matriks : ");
        int m=input.nextInt();
        System.out.print("Masukkan Kolom Matriks : ");
        int n=input.nextInt();
        int A[][]=new int [m][n];
        int B[][]=new int [m][n];
        int hasil[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Masukkan elemen matriks 1 ke ("+(i+1)+","+(j+1)+") : ");
                int elemen=input.nextInt();
                A[i][j]=elemen;
            }
        }
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Masukkan elemen matriks 2 ke ("+(i+1)+","+(j+1)+") : ");
                int elemen=input.nextInt();
                B[i][j]=elemen;
            }
        }
            System.out.println("Hasil Penjumlahan : ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(A[i][j]+B[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Hasil Pengurangan : ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(A[i][j]-B[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Hasil Perkalian : ");
            if(m==n){
                for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    for(int c=0;c<m;c++){
                        hasil[i][j]+=A[i][c]*B[c][j];
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(hasil[i][j]+" ");  
                }
                 System.out.println();
    }
} else {
                System.out.println("Jumlah baris tidak sama dengan jumlah kolom");
            }
}
}

