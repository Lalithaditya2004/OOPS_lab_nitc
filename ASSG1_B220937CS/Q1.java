
import java.util.Scanner;



public class Q1 {

	public static int fact(int n){
		if(n==0 || n==1) return 1;
		return fact(n-1)*n;
	} 
	public static void main(String[] args){
		int n;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(fact(n));	
	}
}
