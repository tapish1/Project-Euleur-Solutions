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

import java.math.BigInteger;
public class problem20 {
    public static void main(String[] args) {
        int num = 100;
        int total=0;
        BigInteger factorial = BigInteger.ONE;
     
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        String strfactorial=factorial.toString();
        
        
        for(int i=0; i<158; i++){
            total+=Character.getNumericValue(strfactorial.charAt(i));
        }
        
        System.out.println(total);
    }
}

