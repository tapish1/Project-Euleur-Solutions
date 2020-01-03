/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuleur;

public class problem12 {
	public static void main (String[]args) {
		
		long num=0;
		long add=1;
		int factors=0;
		while(factors<=500) {
			num+=add;
			add++;
			factors=factors(num);

                        
			}
		System.out.println(num);
		
	}
	
	public static int factors(long num) {
		int count=0;
		
		for(long i=1; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		return count*2;
		
	}
		
	}
