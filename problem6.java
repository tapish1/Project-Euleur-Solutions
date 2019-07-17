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
public class problem6 {
    public static void main(String[]args){
int sum=0;
int sum2=0;
int difference;
     for(int i=1;i<=100;i++){
         sum=sum +(i*i);
         sum2+=i;
     }
     difference=((sum2*sum2)-sum);
     System.out.println("The difference is "+difference);
     
     
     
    
    }
    
}
