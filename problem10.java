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
public class problem10 {
    public static void main(String[]args){
        int count=0;
        int sum=0;
    for(long j=1; j<10; j++)  {  
    
    if(j%2!=0 || j%3!=0 ||  j%5!=0 || j%7!=0){
        sum+=j;
    }
    
}
    System.out.println(sum);
    }
}
 
    

