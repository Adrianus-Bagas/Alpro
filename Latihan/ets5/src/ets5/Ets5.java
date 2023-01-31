package ets5;
import java.util.Scanner;
public class Ets5 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n;
    int a = (int)(3*Math.random()+0);
    System.out.println("0. Scissor");
    System.out.println("1. Rock");
    System.out.println("2. Paper");
    System.out.print("Choose number = "); n = input.nextInt();
        if ((a==0&&n==0)){
        System.out.println("The computer is Scissor");
        System.out.println("You are scissor too");
        System.out.println("It is a draw"); 
    } else if ((a==0&&n==1)){
        System.out.println("The computer is Scissor");
        System.out.println("You are rock");
        System.out.println("You win");
    } else if ((a==0&&n==2)){
        System.out.println("The computer is Scissor");
        System.out.println("You are paper");
        System.out.println("You lose");   
    } else if ((a==1&&n==0)){
        System.out.println("The computer is Rock");
        System.out.println("You are Scissor");
        System.out.println("You lose");
    } else if ((a==1&&n==1)){
        System.out.println("The computer is Rock");
        System.out.println("You are rock too");
        System.out.println("It is a draw");
    } else if ((a==1&&n==2)){
        System.out.println("The computer is Rock");
        System.out.println("You are paper");
        System.out.println("You win");
    } else if ((a==2&&n==0)){
        System.out.println("The computer is Paper");
        System.out.println("You are scissor");
        System.out.println("You win");
    } else if ((a==2&&n==1)){
        System.out.println("The computer is Paper");
        System.out.println("You are rock");
        System.out.println("You lose");
    } else if (a==2&&n==2){
        System.out.println("The computer is paper");
        System.out.println("You are paper too");
        System.out.println("It is a draw");
    } else 
        System.out.println("Error");   
    }
}
    

