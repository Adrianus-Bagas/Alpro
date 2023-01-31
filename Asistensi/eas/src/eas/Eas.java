package eas;
import java.util.Scanner;
public class Eas {
    private static void cPoint(int[]x, int[]y){
        double[]d=new double[20];
        for(int i=0;i<d.length;i++){
            for(int j=0;j<x.length;j++){
                for(int k=0;k<y.length;k++){
                    if(j!=k){
                        d[i]=Math.sqrt((x[k]-x[j])*(x[k]-x[j])+(y[k]-y[j])*(y[k]-y[j]));
                    }
                }
            }
        }
        for(int i=0;i<d.length;i++){
            double temp;
            for(int j=i;j<d.length;j++){
                if(d[j]<=d[i]){
                    temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        System.out.println("Jarak Terpendek : "+d[0]);
    }
    /*public static void main(String[] args) {
    int[]titikX={2,4,6,7,8};
    int[]titikY={2,4,9,5,4};
    cPoint(titikX,titikY);
    }
    public static double average(double[]array){
        double sum=0;
        double rata2;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        rata2=sum/10;
        return rata2;
    }
    public static void main(String[] args){
        double[]angka=new double[10];
        Scanner input=new Scanner (System.in);
        for(int i=0;i<angka.length;i++){
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            double e=input.nextDouble();
            angka[i]=e;
        }
        System.out.println("Rata-rata = "+average(angka));
    }*/
}

    

