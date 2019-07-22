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
public class problem3 {
    public static void main (String [] args){
     
        long num = 600851475143L;
    
       primefactor(num);                
    }
public static void primefactor(long num){
    
  for(int i=2; i<Math.floor(Math.sqrt(num));i++){
      
    if(num%i==0 ){
        num=num/i;
        i--;
        
    }
    }
  System.out.println(num);
    
}


}

        
     
    

