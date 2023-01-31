public class hewan {
    String warna="hitam";
    public hewan(){
        System.out.println("xnxx");
    }
    public String getket(){
        return "hewan";
    }
}
class burung extends hewan{
    public String getket(){
        return "burung";
    }
}
class gagak extends burung{
    String warna="coklat";
    public gagak(){
        System.out.println("pornhub");
    }
}
class demo{
    public static void main(String[] args){
        gagak bg=new gagak();
        cetak(bg);
        cetak(new burung());
        cetak(new hewan());
    }
    public static void cetak(hewan x){
        System.out.println(x.getket()+"---"+x.warna);
    }
}
