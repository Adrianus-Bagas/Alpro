package asistensi;
import java.util.Scanner;
public class operasiMatriksMethod {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan ukuran matriks persegi ");
        System.out.print("Baris : ");
        int m = baca.nextInt();
        System.out.print("Kolom : ");
        int n = baca.nextInt();
        if (m<0 || n<0)
            System.out.println("Tidak ada matriks dengan ukuran tersebut");
        else if (m!=n && (m>0 || n>0))
            System.out.println("Matriks tersebut tidak persegi");
        else {
        int matriks1[][] = new int[m][n];
        int matriks2[][] = new int[m][n];            
            System.out.println("Matriks 1");
            for (int i=0; i<matriks1.length; i++) {
                for (int j=0; j<matriks1[i].length; j++) {
                    System.out.print("Masukkan elemen ke " + (i+1) + "," + (j+1) + " : ");
                    int element1 = baca.nextInt();
                    matriks1[i][j] = element1;
                }
            }
        
            System.out.println("Matriks 2");
            for (int i=0; i<matriks2.length; i++) {
                for (int j=0; j<matriks2[i].length; j++) {
                    System.out.print("Masukkan elemen ke " + (i+1) + "," + (j+1) + " : ");
                    int element2 = baca.nextInt();
                    matriks2[i][j] = element2;
                }
            }
        
            System.out.println("\nMatriks 1");
            for (int i=0; i<matriks1.length; i++) {
                for (int j=0; j<matriks1[i].length; j++) {
                    System.out.print(matriks1[i][j] + " ");
                }
                System.out.println();
            }
        
            System.out.println("Matriks 2");
            for (int i=0; i<matriks2.length; i++) {
                for (int j=0; j<matriks2[i].length; j++) {
                    System.out.print(matriks2[i][j] + " ");
                }
                System.out.println();
            }
        
            penjumlahan(matriks1,matriks2);
            pengurangan(matriks1,matriks2);
            perkalian(matriks1,matriks2);
                    
        }
    }
    
    public static void penjumlahan(int[][] matriks1, int[][] matriks2) {
        System.out.println("\nMatriks 1 + Matriks 2 ");
        for (int i=0; i<matriks1.length; i++) {
            for (int j=0; j<matriks1[i].length; j++) {
                int jumlah = matriks1[i][j] + matriks2[i][j];
                System.out.print(jumlah + " ");
            }
            System.out.println();
        }
    }
    
    public static void pengurangan(int[][] matriks1, int[][] matriks2) {
        System.out.println("\nMatriks 1 - Matriks 2 ");
        for (int i=0; i<matriks1.length; i++) {
            for (int j=0; j<matriks1[i].length; j++) {
                int kurang = matriks1[i][j] - matriks2[i][j];
                System.out.print(kurang + " ");
            }
            System.out.println();
        }
    }
    
    public static void perkalian(int[][] matriks1, int[][] matriks2) {
        System.out.println("\nMatriks 1 x Matriks 2 ");
        for (int i=0; i<matriks1.length; i++) {
            for (int j=0; j<matriks2[i].length; j++) {
                int kali=0;
                for (int k=0; k<matriks2.length; k++) {
                   kali += matriks1[i][k] * matriks2[k][j]; 
                }
                System.out.print(kali + " "); 
            }
            System.out.println();
        }        
    }
}
