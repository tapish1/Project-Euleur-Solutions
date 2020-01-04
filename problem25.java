package projecteuleur;

import java.math.BigInteger;

public class problem25 {
	public static void main(String []args) {
		
		
		BigInteger n3=BigInteger.valueOf(0);
		BigInteger n1=BigInteger.valueOf(1);
		BigInteger n2=BigInteger.valueOf(1);
		BigInteger base=new BigInteger("10");
		BigInteger limit=base.pow(999);

		
		int count=2;
		
		while(n3.compareTo(limit)!=1) {
			n3=n1.add(n2);
			n1=n2;
			n2=n3;
			//String res=""+n3;
			//strlength=res.length();
			count++;
		}
		System.out.println(count);
		
		
	}

}
