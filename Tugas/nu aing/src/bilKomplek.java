public class bilKomplek {
    private int riil, imajiner;
    public bilKomplek(){
        this.riil=0;
        this.imajiner=0;
    }
    public bilKomplek(int r, int i){
        this.riil=r;
        this.imajiner=i;
    }
    public void setRiil(int r){
        this.riil=r;
    }
    public void setImajiner(int i){
        this.imajiner=i;
    }
    public int getRiil(){
        return riil;
    }
    public int getImajiner(){
        return imajiner;
    }
    public void info(){
        System.out.println("Bilangan Kompleks   : "+riil+"+"+imajiner+"i");
    }
    public double modulus(bilKomplek p){
        double mod=Math.sqrt(p.riil*p.riil+p.imajiner*p.imajiner);
        return mod;
    }
    public double arg(bilKomplek q){
        double arg=Math.tan(q.imajiner/q.riil);
        return arg;
    }
}
