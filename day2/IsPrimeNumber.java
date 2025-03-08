package week1.day2;

public class IsPrimeNumber {
public static void main(String[] args) {
	int n =13;
	if (n<=1) {
		System.out.println("It is not a Prime Number");	
	}
		
	for (int i = 2;i<n;i++) {
		if(n%i==0) {
            System.out.println("It is not a Prime Number");	
		return;
	}
}
	  System.out.println("It is a Prime Number"); 
}
}
	    


