package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int range =8;
	int first_num =0;
	int second_num =1;
	int next_num;
	
	for(int i=0;i<range;i++) {
		System.out.println(first_num);
		next_num = first_num+second_num;
		first_num = second_num;
		second_num =next_num;
	}
	 
	
}
}
