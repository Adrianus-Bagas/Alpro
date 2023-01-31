package eas5;
public class Eas5 {
        private static void cPoint(int[]x,int[]y){
            double[]d=new double[10];
            d[0]=Math.sqrt((x[0]-x[1])*(x[0]-x[1])+(y[0]-y[1])*(y[0]-y[1]));
            d[1]=Math.sqrt((x[0]-x[2])*(x[0]-x[2])+(y[0]-y[2])*(y[0]-y[2]));
            d[2]=Math.sqrt((x[0]-x[3])*(x[0]-x[3])+(y[0]-y[3])*(y[0]-y[3]));
            d[3]=Math.sqrt((x[0]-x[4])*(x[0]-x[4])+(y[0]-y[4])*(y[0]-y[4]));
            d[4]=Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
            d[5]=Math.sqrt((x[1]-x[3])*(x[1]-x[3])+(y[1]-y[3])*(y[1]-y[3]));
            d[6]=Math.sqrt((x[1]-x[4])*(x[1]-x[4])+(y[1]-y[4])*(y[1]-y[4]));
            d[7]=Math.sqrt((x[2]-x[3])*(x[2]-x[3])+(y[2]-y[3])*(y[2]-y[3]));
            d[8]=Math.sqrt((x[2]-x[4])*(x[2]-x[4])+(y[2]-y[4])*(y[2]-y[4]));
            d[9]=Math.sqrt((x[3]-x[4])*(x[3]-x[4])+(y[3]-y[4])*(y[3]-y[4]));
            for(int i=0;i<d.length;i++){
                double temp;
                for(int j=i;j<d.length;j++){
                    if(d[j]<=d[i]){
                        temp=d[i];
                        d[i]=d[j];
                        d[j]=temp;
                    }
                }
            }
            System.out.println("Jarak Terpendek = "+d[0]);
        }
        public static void main(String[] args){
            int[]titikX={2,4,6,7,8};
            int[]titikY={2,4,9,5,4};
            cPoint(titikX,titikY);
        }
        
    }
    

