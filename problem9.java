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
public class problem9 {
    public static void main (String[]args){
        
        int sum=1000;
        System.out.println(product(sum));
    }
        
        public static int product(int sum){
            int c;
        int a;
        int b;
            for(int i=1; i<sum; i++){
            for(int j=1; j<sum; j++){
                a=i;
                b=j;
                c=sum-a-b;
                if(a*a+b*b==c*c){
                    return a*b*c;
                    
                }
            
        }
         
            }
        return 0;
        }

    }
    

