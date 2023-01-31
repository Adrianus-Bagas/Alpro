public class karyawan{
    private String nama,jeniskelamin;
    public karyawan(String n, String j){
        this.nama=n;
        this.jeniskelamin=j;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setJenis(String j){
        this.jeniskelamin=j;
    }
    public String getNama(){
        return nama;
    }
    public String getJenis(){
        return jeniskelamin;
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
        System.out.println("Asal    : "+asal);
        System.out.println("Tahun   : "+tahun);
    }
}
