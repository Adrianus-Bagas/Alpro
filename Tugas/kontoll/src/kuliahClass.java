public class kuliahClass {
    public static String nama, nrp;
    public kuliahClass(){
        this.nama="ghjk";
    }
    public kuliahClass(String n, String nrp){
        this.nama=n;
        this.nrp=nrp;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setNRP(String nrp){
        this.nrp=nrp;
    }
    public String getNama(){
        return nama;
    }
    public String getNRP(){
        return nrp;
    }
    public void info(){
        System.out.println("Nama    : "+getNama());
        System.out.println("NRP     : "+getNRP());
    }
}
class mtk extends kuliahClass{
    private int angkatan;

    public mtk(String n, String nrp, int a) {
        super(n,nrp);
        this.angkatan=a;
    }
    public void setAngkatan(int a){
        this.angkatan=a;
    }
    public int getAngkatan(){
        return angkatan;
    }
    public void infomtk(){
        System.out.println("Nama        : "+getNama());
        System.out.println("NRP         : "+getNRP());
        System.out.println("Angkatan    : "+getAngkatan());
    }
}