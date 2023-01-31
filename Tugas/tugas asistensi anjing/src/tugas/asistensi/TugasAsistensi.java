package tugas.asistensi;
import java.util.Scanner;
public class TugasAsistensi {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input = "); 
    double a=input.nextDouble();
    int b=input.nextInt();
    int c=input.nextInt();
    if(a==0){
        System.out.println("Nilai a tidak boleh 0");
    } else if((a>1&&b>1&&c>0)||(a<-1&&b>1&&c>0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+"+b+"x+"+c+" memiliki :\n",a);
    } else if((a>1&&b>1&&c==0)||(a<-1&&b>1&&c==0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+"+b+"x memiliki :\n",a);
    } else if((a>1&&b>1&&c<0)||(a<-1&&b>1&&c<0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+"+b+"x"+c+" memiliki :\n",a);
    } else if((a>1&&b==1&&c>0)||(a<-1&&b==1&&c>0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+x+"+c+" memiliki :\n",a);
    } else if((a>1&&b==1&&c==0)||(a<-1&&b==1&&c==0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+x memiliki :\n",a);
    } else if((a>1&&b==1&&c<0)||(a<-1&&b==1&&c<0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+x"+c+" memiliki :\n",a);
    } else if((a>1&&b==0&&c>0)||(a<-1&&b==0&&c>0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2+"+c+" memiliki :\n",a);
    } else if((a>1&&b==0&&c==0)||(a<-1&&b==0&&c==0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2 memiliki :\n",a);
    } else if((a>1&&b==0&&c<0)||(a<-1&&b==0&&c<0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2"+c+" memiliki :\n",a);
    } else if((a>1&&b==-1&&c>0)||(a<-1&&b==-1&&c>0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2-x+"+c+" memiliki :\n",a);
    } else if((a>1&&b==-1&&c==0)||(a<-1&&b==-1&&c==0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2-x memiliki :\n",a);
    } else if((a>1&&b==-1&&c<0)||(a<-1&&b==-1&&c<0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2-x"+c+" memiliki :\n",a);
    } else if((a>1&&b<-1&&c>0)||(a<-1&&b<-1&&c>0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2"+b+"x+"+c+" memiliki :\n",a);
    } else if((a>1&&b<-1&&c==0)||(a<-1&&b<-1&&c==0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2"+b+"x memiliki :\n",a);
    } else if((a>1&&b<-1&&c<0)||(a<-1&&b<-1&&c<0)){
        System.out.printf("Polinomial "+"%.0f"+"x^2"+b+"x"+c+" memiliki :\n",a);
    } else if(a==1&&b>1&&c>0){
        System.out.println("Polinomial x^2+"+b+"x+"+c+" memiliki :");
    } else if(a==1&&b>1&&c==0){
        System.out.println("Polinomial x^2+"+b+"x memiliki :");
    } else if(a==1&&b>1&&c<0){
        System.out.println("Polinomial x^2+"+b+"x"+c+" memiliki :");
    } else if(a==1&&b==1&&c>0){
        System.out.println("Polinomial x^2+x+"+c+" memiliki :");
    } else if(a==1&&b==1&&c==0){
        System.out.println("Polinomial x^2+x memiliki :");
    } else if(a==1&&b==1&&c<0){
        System.out.println("Polinomial x^2+x"+c+" memiliki :");
    } else if(a==1&&b==0&&c>0){
        System.out.println("Polinomial x^2+"+c+" memiliki :");
    } else if(a==1&&b==0&&c==0){
        System.out.println("Polinomial x^2 memiliki :");
    } else if(a==1&&b==0&&c<0){
        System.out.println("Polinomial x^2"+c+" memiliki :");
    } else if(a==1&&b==-1&&c>0){
        System.out.println("Polinomial x^2-x+"+c+" memiliki :");
    } else if(a==1&&b==-1&&c==0){
        System.out.println("Polinomial x^2-x memiliki :");
    } else if(a==1&&b==-1&&c<0){
        System.out.println("Polinomial x^2-x"+c+" memiliki :");
    } else if(a==1&&b<-1&&c>0){
        System.out.println("Polinomial x^2"+b+"x+"+c+" memiliki :");
    } else if(a==1&&b<-1&&c==0){
        System.out.println("Polinomial x^2"+b+"x memiliki :");
    } else if(a==1&&b<-1&&c<0){
        System.out.println("Polinomial x^2"+b+"x"+c+" memiliki :");
    } else if(a==-1&&b>1&&c>0){
        System.out.println("Polinomial -x^2+"+b+"x+"+c+" memiliki :");
    } else if(a==-1&&b>1&&c==0){
        System.out.println("Polinomial -x^2+"+b+"x memiliki :");
    } else if(a==-1&&b>1&&c<0){
        System.out.println("Polinomial -x^2+"+b+"x"+c+" memiliki :");
    } else if(a==-1&&b==1&&c>0){
        System.out.println("Polinomial -x^2+x+"+c+" memiliki :");
    } else if(a==-1&&b==1&&c==0){
        System.out.println("Polinomial -x^2+x memiliki :");
    } else if(a==-1&&b==1&&c<0){
        System.out.println("Polinomial -x^2+x"+c+" memiliki :");
    } else if(a==-1&&b==0&&c>0){
        System.out.println("Polinomial -x^2+"+c+" memiliki :");
    } else if(a==-1&&b==0&&c==0){
        System.out.println("Polinomial -x^2 memiliki :");
    } else if(a==-1&&b==0&&c<0){
        System.out.println("Polinomial -x^2"+c+" memiliki :");
    } else if(a==-1&&b==-1&&c>0){
        System.out.println("Polinomial -x^2-x+"+c+" memiliki :");
    } else if(a==-1&&b==-1&&c==0){
        System.out.println("Polinomial -x^2-x memiliki :");
    } else if(a==-1&&b==-1&&c<0){
        System.out.println("Polinomial -x^2-x"+c+" memiliki :");
    } else if(a==-1&&b<-1&&c>0){
        System.out.println("Polinomial -x^2"+b+"x+"+c+" memiliki :");
    } else if(a==-1&&b<-1&&c==0){
        System.out.println("Polinomial -x^2"+b+"x memiliki :");
    } else if(a==-1&&b<-1&&c<0){
        System.out.println("Polinomial -x^2"+b+"x+"+c+" memiliki :");
    }
    double D,x1,x2,x11,d1; 
    D=b*b-4*a*c;
        System.out.println("1.Diskriminan = "+D);
      if (D == 0) {
          x1 = (-b + Math.pow(D,0.5))/(2*a);
          System.out.println("2.Akar-akar dari polinomial = "+x1);
      }
      else {
          if (D>0) {
           x1 = (-b + Math.pow(D,0.5))/(2*a);
            x2 = (-b - Math.pow(D,0.5))/(2*a);
            System.out.println("2.Akar-akar dari polinomial = "+x1 + " dan "+x2);       
          }
          else {
              x11 = -b/(2*a);
              d1 = Math.abs(Math.sqrt(Math.abs(D))/(2*a));
              System.out.printf("2.Akar-akar dari polinomial = "+x11+"+"+"%.3f"+"i "+"dan "+x11+"-"+"%.3f"+"i\n",d1,d1);
          }
    }
    double x,y;
    x=(-b)/(2*a);
    y=(-D)/(4*a);
        System.out.println("3.Titik Stasioner  = ("+x+","+y+")");
    double kc;
    kc=2*a;
    if(kc>0){
        System.out.println("4.Kecekungan Kurva = Atas");
    } else {
        System.out.println("4.Kecekungan Kurva = Bawah");
    }
        System.out.println("5.Nilai minimum lokal = "+y);
}
}