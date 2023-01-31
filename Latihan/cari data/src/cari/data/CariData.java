package cari.data;
import java.util.Scanner;
public class CariData {
    public static void main(String[] args) {
        int[]Data={21,4,94,14,1,9,2};
        System.out.print("Masukkan data yang dicari : ");
        Scanner cari=new Scanner(System.in);
        int key=cari.nextInt();       
        boolean temukan=false;
        for(int i=0;i<Data.length;i++){
            if(key==Data[i]){
                temukan=true;
                break;
            }
        }
        if(temukan){
            System.out.println("Data "+key+" ada");
        } else {
            System.out.println("Data "+key+" tidak ada");
        }
    }
}