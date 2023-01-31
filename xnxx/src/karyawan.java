public class karyawan {
    public static void main(String[] args){
        manager dita=new manager("Dita","80",2018);
        direktur villa=new direktur("Villa","70",2015,4);
        dita.infomanager();
        System.out.println();
        villa.infodirektur();
    }
    private String nama,id;
    public karyawan(String n, String id){
        this.nama=n;
        this.id=id;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setID(String id){
        this.id=id;
    }
    public String getNama(){
        return nama;
    }
    public String getID(){
        return id;
    }
    public void infokaryawan(){
        System.out.println("Nama        : "+getNama());
        System.out.println("ID          : "+getID());
    }
}
class manager extends karyawan{
    private int tahun;
    public manager(String n, String id, int t){
        super(n,id);
        this.tahun=t;
    }
    public void setTahun(int t){
        this.tahun=t;
    }
    public int getTahun(){
        return tahun;
    }
    public void infomanager(){
        super.infokaryawan();
        System.out.println("Tahun       : "+getTahun());
    }
}
class direktur extends karyawan{
    private int jabatan;
    public direktur(String n, String id, int t, int j){
        super(n,id);
        this.jabatan=j;
    }
    public void setJabatan(int j){
        this.jabatan=j;
    }
    public int getJabatan(){
        return jabatan;
    }
    public void infodirektur(){
        super.infokaryawan();
        System.out.println("Jabatan ke  : "+getJabatan());
    }
}
