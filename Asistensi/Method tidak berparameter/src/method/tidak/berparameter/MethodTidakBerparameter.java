package method.tidak.berparameter;
 public class MethodTidakBerparameter {
    /*private static void methodTakBerparameter(){
        System.out.println("Ini method tak berparameter");
    }
    public static void main(String[] args) {
        System.out.println("Menjalankan method");
        methodTakBerparameter();
        */
    /*private static void methodBerparameter(String s){
        System.out.println("Halo "+s);
    }
    public static void main(String[] args){
        String nama="Bagas";
        methodBerparameter(nama);
*/
    
        /*public static String lebihBesar(int a, int b){
            if(a>b)
                return "Benar";
            else
                return "Salah";
        }
        public static void main(String[] args){
            int angka1 = 24;
            int angka2 = 12;
            
            System.out.println("Apakah angka 1 "+"lebih besar dari "+" angka 2 ? "+lebihBesar(angka1,angka2));
*/
        public static int fibonacci(int a){
            if(a==1||a==2){
                return 1;
            } else {
                return (fibonacci(a-1)+fibonacci(a-2));
            }
        }
        public static void main(String[] args){
            int sukuKe=5;
            System.out.println("Suku ke "+sukuKe+" dari "+"deret Fibonacci adalah "+" "+fibonacci(sukuKe));
        }
    }
    
      

