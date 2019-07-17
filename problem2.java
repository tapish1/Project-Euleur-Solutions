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
public class problem2 {
    public static void main (String [] args){
       long value=1;
       long sum=0;
       long sum2=0;
       long total=0;
     while(sum<4000000){ 
        sum=value+sum;
          value=sum-value;

        if(sum%2==0){
            
           total=sum+total;
        }

     }
                   System.out.println(total);


    
    }
    
}
