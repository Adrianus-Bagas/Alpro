public class karyawan {
      public static void main(String[] args){
       karyawan k1=new karyawan("Zayn","Cowo");
       manager m1=new manager("Zayn","Cowok","BDG",100);
       k1.info();
       m1.view();
    }
    private String nama,jenis;
    public karyawan(String n, String j){
        this.nama=n;
        this.jenis=j;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setJenis(String j){
        this.jenis=j;
    }
    public String getNama(){
        return nama;
    }
    public String getJenis(){
        return jenis;
    }
    public void info(){
        System.out.println("Nama    : "+getNama());
        System.out.println("Jenis   : "+getJenis());
    }
}
class manager extends karyawan{
    private String asal;
    private int tahun;
    public manager(String n, String j, String a, int t){
        super(n,j);
        this.asal=a;
        this.tahun=t;
    }
    public void setAsal(String a){
        this.asal=a;
    }
    public void setTahun(int t){
        this.tahun=t;
    }
    public String getAsal(){
        return asal;
    }
    public int getTahun(){
        return tahun;
    }
    public void view(){
        super.info();
        System.out.println("Asal    : "+getAsal());
        System.out.println("Tahun   : "+getTahun());
        
    }
}