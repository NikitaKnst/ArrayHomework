/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbers =new int [20];
        Random rnd = new Random();
        for (int i = 0; i<numbers.length; i++  ){
        numbers[i]=rnd.nextInt(100);
        System.out.printf("%5d", numbers[i]);
        
    }
        System.out.println("");
        int max=numbers[1];
        for (int i=1; i < numbers.length; i++){
            if(numbers[i] >max){
                max=numbers[i];
            }
    }
    }
    
}
