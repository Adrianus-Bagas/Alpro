import java.util.Scanner;
public class Binary_Search
{
    public static void main(String[] Args)
    {
        int angka;
        System.out.println("Program Binary Search");
        System.out.println();
        System.out.println("Kumpulan data Array of Random");
        boolean notfound=true;
        int[] intarray = {1,3,4,6,9,11,17,20};
        
        for(int i=0;i<intarray.length;i++)         {
             System.out.print(intarray[i]+" ");
         }
        Scanner sc=new Scanner(System.in);
        System.out.print("\nMasukan angka yang ingin dicari = ");
        angka=sc.nextInt();
        
        int batasAtas=intarray.length-1;
        int batasBawah=0;
        
        while (notfound)
        {
            int posisiSekarang = (batasAtas + batasBawah)/2;
            if(intarray[posisiSekarang] == angka)
            {
                notfound=false;
                System.out.println("Angka "+angka+" ditemukan" );
            }
            else if(batasBawah>batasAtas)
            {
            System.out.println("Angka " +angka+" tidak ditemukan");
            break;
            }
            else
            {
                if(intarray[posisiSekarang]< angka)
                {
                    batasBawah = posisiSekarang+1;
                }
                else
                {
                    batasAtas = posisiSekarang-1;
                }
            }
        }
    }
}