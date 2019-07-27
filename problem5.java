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
public class problem5 {
    public static void main(String[]args){
    long num=3628800;
    boolean it=false;
  while(it==false)  
    if(num%11==0 && num%12==0 && num%13==0 && num%14==0 && num%15==0 && num%16==0 && num%17==0 && num%18==0 && num%19==0 && num%20==0){
        it=true;
        System.out.println(num);
    }else{
        num+=60;
    }
}
    
}
