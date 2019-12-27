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
public class problem4 {
    public static void main (String[]agrs){
        int product=0;
        int temp=0;
        for(int i=100;i<1000;i++){
            for(int j=100; j<1000;j++){
                product=i*j;
                if(product==reverse(product) && product>temp){
                    temp=product;                    
                    product=0;
                }else{
                    product=0;
                }
                }
               
            }
        System.out.println(temp);
        }
    
    public static int reverse (int num){
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
             num/=10;
        }
        return reverse;
        
    }
    }
    

