package sorting.seleksi;
public class SortingSeleksi {
public static void main(String[] args) {
    int[]angka={8,3,4,7,2,6,5,1,10,9};
    Selection_Short(angka);
    }
    public static void Selection_Short (int[]angka){
        for(int i=0;i<angka.length;i++){
            int temp;
            for(int j=i;j<angka.length;j++){
                if (angka[j]<=angka[i]){
                    temp=angka[j];
                    angka[j]=angka[i];
                    angka[i]=temp;
        }
    }
}
        System.out.println("--Selection Sort--");
        for(int i=0;i<angka.length;i++){
            System.out.print(angka[i]+" ");
        }
        System.out.println();
    }
}
