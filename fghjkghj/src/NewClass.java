class karyawan{
     public static void main(String[] args) {
        manajer Dev = new manajer("DEVANY", "76", 2018,"HRD","SBY","Virgo");
        direktur vil = new direktur("villa","80","PT Bank muamalat",4);
        Dev.view();
        vil.view();
        Dev.getBiodata("SURABAYA", "LEO"); 
    }
    String nama;
    String ID;
    
    karyawan(String nama, String ID){
        this.nama = nama;
        this.ID =ID;
    }
    
    public void view(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("ID\t\t: "+ID);
    }
}
class manajer extends karyawan{
    int th_mulai;
    String unit;
    String asal;
    String zodiak;
    
    public manajer (String nama, String ID, int th_mulai, String unit,String asal,String zodiak){
        super(nama,ID);
        this.asal=asal;
        this.zodiak=zodiak;
        this.th_mulai = th_mulai;
        this.unit=unit;
    }
    public void getBiodata(String asal, String zodiak){
        this.asal = asal;
        this.zodiak = zodiak;
        System.out.println("Asal\t\t: "+asal);
        System.out.println("Zodiak\t\t: "+zodiak);
    }
    
    public void view(){
        super.view();
        System.out.println("Th_mulai\t: "+th_mulai);
        System.out.println("unit\t: "+unit);
    }
}
 class direktur extends karyawan{
        String perusahaan;
        int jabatan;   
        public direktur(String nama,String ID,String perusahaan,int jabatan){
            super(nama,ID);
            this.jabatan = jabatan;
            this.perusahaan = perusahaan;
        }
            public void view(){
               super.view();
               System.out.println("jabatan ke:"+jabatan);
               System.out.println("perusahaan:"+perusahaan);
            }
 }

