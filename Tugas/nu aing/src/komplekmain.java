public class komplekmain {
    public static void main(String[] args){
        bilKomplek b1=new bilKomplek(1,2);
        b1.info();
        System.out.println("Modulus : "+b1.modulus(b1));
        System.out.println("Argumen : arctan("+b1.arg(b1)+")");
    }
}
