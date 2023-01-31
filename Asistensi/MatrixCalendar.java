package asistensi;
import java.util.Scanner;
public class MatrixCalendar {
    public static void main(String[] args) {
        int BL[] = new int [13];
        BL[0]=31;
        BL[1]=31;
        BL[2]=28;
        BL[3]=31;
        BL[4]=30;
        BL[5]=31;
        BL[6]=30;
        BL[7]=31;
        BL[8]=31;
        BL[9]=30;
        BL[10]=31;
        BL[11]=30;
        BL[12]=31;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();
        System.out.print("Masukkan bulan : ");
        int bulan = input.nextInt();
        
        if(tahun%400==0||tahun%4==0&&tahun%100!=0){
            BL[2]=29;
        }
        else{
            BL[2]=28;
        }
        int jumh = (tahun-1)*365 + (tahun-1)/4 - (tahun-1)/100 + (tahun-1)/400;
        
        if(bulan==1){
            System.out.println("\t\t\tJanuari");
        }
        else if(bulan==2){
            System.out.println("\t\t\tFebruari");
        }
        else if(bulan==3){
            System.out.println("\t\t\tMaret");
        }
        else if(bulan==4){
            System.out.println("\t\t\tApril");
        }
        else if(bulan==5){
            System.out.println("\t\t\tMei");
        }
        else if(bulan==6){
            System.out.println("\t\t\tJuni");
        }
        else if(bulan==7){
            System.out.println("\t\t\tJuli");
        }
        else if(bulan==8){
            System.out.println("\t\t\tAgustus");
        }
        else if(bulan==9){
            System.out.println("\t\t\tSeptember");
        }
        else if(bulan==10){
            System.out.println("\t\t\tOktober");
        }
        else if(bulan==11){
            System.out.println("\t\t\tNovember");
        }
        else if(bulan==12){
            System.out.println("\t\t\tDesember");
        }
        System.out.println();
        for(int i=1; i<bulan; i++){
            jumh=jumh+BL[i];
        }
        System.out.println("Minggu\tSenin\tSelasa\t Rabu\tKamis\tJumat\tSabtu");
        
        int x = 1;
        jumh = jumh + 1;
        int hari = jumh % 7;
        
        if(hari==0){
            System.out.print(x + "  \t ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\t 3\t 4\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\t 3\t 4\t 5\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\n");
            }
            else {
               System.out.print("1\t 2\t 3\t 4\t 5\t 6\t 7\n"); 
            }
        }
        if(hari==1){
            if (tahun != 1) {
                for (int i=BL[bulan-1]; i<=BL[bulan-1]; i++) {
                    System.out.print(i);
                }
            }
            System.out.print("\t " + x + "  \t ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\t 3\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\t 3\t 4\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\t 3\t 4\t 5\n");
            }
            else {
               System.out.print("1\t 2\t 3\t 4\t 5\t 6\n"); 
            }
        }
        if(hari==2){
            for (int i=BL[bulan-1]-1; i<=BL[bulan-1]; i++) {
                System.out.print(i + " \t ");
            }                
            System.out.print(x + "  \t ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\t 3\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\t 3\t 4\n");
            }
            else {
               System.out.print("1\t 2\t 3\t 4\t 5\n"); 
            }
        } 
        if(hari==3){
            for (int i=BL[bulan-1]-2; i<=BL[bulan-1]; i++) {
                System.out.print(i + " \t ");
            }
            System.out.print(x + "  \t ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\t 3\n");
            }
            else {
               System.out.print("1\t 2\t 3\t 4\n"); 
            }
        }
        if(hari==4){
            for (int i=BL[bulan-1]-3; i<=BL[bulan-1]; i++) {
                System.out.print(i + " \t ");
            }
            System.out.print(x + "  \t  ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\t  7\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\n");
            }
            else {
               System.out.print("1\t 2\t 3\n"); 
            }
        }
        if(hari==5){
            for (int i=BL[bulan-1]-4; i<=BL[bulan-1]; i++) {
                System.out.print(i + " \t ");
            }    
            System.out.print(x + "  \t ");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\t 7\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\n");
            }
            else {
               System.out.print("1\t 2\n"); 
            }
        }
        if(hari==6){
            for (int i=BL[bulan-1]-5; i<=BL[bulan-1]; i++) {
                System.out.print(i + " \t ");
            }
            System.out.print(x + "\n");
            tanggal(jumh,hari,x,bulan,BL);
            if (bulan==1 || bulan==3 || bulan==5 || bulan==7 || bulan==8 || bulan==10 || bulan==12) {
                System.out.print("1\t 2\t 3\t 4\t 5\n");
            }
            else if (bulan==4 || bulan==6 || bulan==9 || bulan==11) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\n");
            }
            else if (bulan==2&&(tahun%400==0||tahun%4==0&&tahun%100!=0)) {
                System.out.print("1\t 2\t 3\t 4\t 5\t 6\t 7\n");
            }
            else {
               System.out.print("1\n"); 
            }
        }  
    }
    
    public static void tanggal(int jumh, int hari, int x,int bulan, int[] BL) {
        for(x=2 ;x<=BL[bulan];x++){
            jumh = jumh + 1;
            hari = jumh % 7;
            if(hari==6){
                System.out.print(x + "\n");
            }
            else{
                System.out.print(x + "  \t ");
            }
        }    
    }
}   
