package test;

//**************************************
//Name: Factorial
//Description: This is just a simple input output permutation calculator. 
//Long version originally by: Juan J De Los Santos
//
import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
public static void main(String[] args) {
BigInteger total = BigInteger.ONE;
	Scanner scn = new Scanner(System.in);
		
	System.out.println("Enter a number you want to permutate.");
	int num = scn.nextInt();
BigInteger bigint = BigInteger.valueOf(num);
//System.out.print(num+"! = ");
double logeTotal = 0.d, cntdwnNum = num; // init for alt factorial via logs
			
while ( bigint.compareTo(BigInteger.ONE) == 1 ) { // multiply while >1
total = total.multiply(bigint); // integer multiplication method
System.out.println("bigint total "+total);
bigint = bigint.subtract(BigInteger.ONE); // count down
System.out.println("bigint subtract "+bigint);
/*logeTotal += Math.log(cntdwnNum--); // decimal log sum method (which are multiplies)
System.out.println("logeTotal "+logeTotal);*/
	}
	
System.out.println(num+"! = "+total); // BigInteger factorial
/*double dTotal = total.doubleValue(); // accurate decimal version (for visual comparison)
if (dTotal != Double.POSITIVE_INFINITY) { // don't bother if result too large for double
System.out.println(" or scientific notation format of BigInteger: "+dTotal);
System.out.println(" or log summation: "+Math.exp(logeTotal));
double dNum = num; // convert int to double once but used more than a dozen times
System.out.print(" or Stirling's approximation: ");
System.out.println(Math.sqrt((dNum+dNum)*Math.PI)*Math.pow(dNum/Math.E,dNum));
System.out.print(" or Srinivasa Ramanujan's approximation: ");
System.out.println(Math.exp(Math.log(Math.PI)/2.d
-dNum+Math.log(dNum)*dNum+Math.log(dNum+dNum)/2.d
+Math.log1p(1.d/8.d/dNum/dNum+1.d/(dNum+dNum))/6.d));
} else { // conversion to double fails but log total has the pieces to display a value
double log10Total = logeTotal/Math.log(10.d); // convert to log10 (but further loss of accuracy)
double exponentOfTotal = Math.floor(log10Total); // grab the exponent
System.out.println(" or log summation: "+Math.pow(10.d,log10Total-exponentOfTotal)
+"E"+(long)exponentOfTotal);
}*/
}
}
