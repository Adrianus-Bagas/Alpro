package matriks;
import java.util.Scanner;
public class matriks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);         
        int [][]matrixA=new int[3][3];
        int [][]matrixB=new int[3][3];
        int [][]hasil=new int[3][3];
        System.out.println("Matrix A");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.print( a + "." + b + " = ");
                matrixA[a][b]=input.nextInt();
            }
        }
        System.out.println("Matrix B");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.print(a + "." + b + " = ");
                matrixB[a][b]=input.nextInt();
            }
        }
        System.out.println("Matrix A");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.print(" "+matrixA[a][b]);
            }
            System.out.println(" ");
        }
        System.out.println("Matrix B");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.print(" "+matrixB[a][b]);
            }
            System.out.println(" ");
        }
        System.out.println("Hasil dari A X B ");
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                for(int c=0;c<3;c++){
                    hasil[a][b]+=matrixA[a][c]*matrixB[c][b];
                }                
            }            
        }
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.print(hasil[a][b]+" ");
            }
            System.out.println(" ");
         }
        
      }
    }