/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arrayku={1,23,17,4,5,100};
        int i;
        System.out.println("Tampil data array dgn loop dari depan");
        for(i=0;i<6;i++){
            System.out.println(arrayku[i]+" ");
        }
        System.out.println();
        System.out.println("Tampil data array dgn loop dari belakang");
        for(i=5;i>=0;i--){
            System.out.println(arrayku[i]+"");
        }
    }
    
}
