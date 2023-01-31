package dimas.anjing;
public class DimasAnjing {
   public static void main(String[] args) {
       int[]angka={2,6,4,7,8,3,5,1,9};
       number(angka);
    }
   public static void number(int[]num){
       for(int i=0;i<num.length;i++){
           int temp;
           for(int j=i;j<num.length;j++){
               if(num[j]<=num[i]){
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp;
               }
           }
       }
       for(int i=0;i<num.length;i++){
           System.out.print(num[i]+" ");
   }
       System.out.println();
}
}
