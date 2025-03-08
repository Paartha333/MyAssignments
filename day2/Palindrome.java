package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	
int input = 1242;
int reverse = 0;
for (int i =input;i>0;i/=10) {
	int rem = i%10;
	reverse = reverse*10 + rem;
}
if (input==reverse) {
	System.out.println("It is a palindrome");
}
else {
	System.out.println("Not a palindrome");
}

	
}



	

}
