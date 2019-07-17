/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuleur;

/**
 *
 * @author tapishjain
 */
public class Projecteuleur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numcheck=0;
       long sum=0;
       while(numcheck<1000){
           numcheck++;
           if(numcheck%3==0 || numcheck%5==0){
               sum=sum+numcheck;
           }
       }
       System.out.println(sum);
        } 
    
    
    
    
}
