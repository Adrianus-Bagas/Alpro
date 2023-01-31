package pkgbreak.asis;
public class BREAKASIS {
    public static void main(String[] args) {
        int x=35;
        int y=4;
        int dummy=y;
        mulai :
        while(true){
            if(y>x){
                System.out.println("Nilai kelipatan y yang mendekati x adalah "+y);
                break mulai;
            } else {
                y=y+dummy;
            }
        }
    }
    
}
