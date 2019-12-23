/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuleur;
import java.lang.*;
/**
 *
 * @author tapishjain
 */
public class problem16 {
    public static void main(String[]args){
        double num=Math.pow(2,1000);
        int total=0;
        
        while(num>0){
            total+= num%10;
            num=Math.floor(num/10);
        }
    
    System.out.println(total);
    }
    
}
