package functions;
import java.util.*;


public class Functions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		sum(n1,n2);
		product(n1,n2);
		maxNo(n1,n2,n3);
		circle(n1);
		even_odd(n1);
		vote(n1);
		prime(n1);
		perfect_all(n2,n3);
	}
	public static void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public static void product(int n1, int n2) {
		System.out.println(n1*n2);
	}
	public static void circle(int n1) {
		System.out.println("circumference:" + 3.14*2*n1);
		System.out.println("area:" + 3.14*n1*n1);
	}
	public static void maxNo(int n1,int n2,int n3) {
		System.out.println((n1>n2)?n1>n3?n1:n3:n2>n3?n2:n3);
	}
	public static void even_odd(int n1) {
		if(n1%2==0)
			System.out.println("even");
		else System.out.println("odd");
	}
	public static void vote(int n1) {
		if(n1>=18) {
			System.out.println("eligible");
		}
		else System.out.println("not eligible");
	}
	public static void prime(int n1) {
		int flag=1;
		for(int i=2 ; i<n1/2 ; i++) {
			if(n1%i!=0) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("prime");
		else System.out.println("not prime");
	}
	public static void cube(int n1) {
		System.out.println(n1*n1*n1);
	}
	
	public static boolean perfect(int n1) {
		int sum=0;
		for(int i=1;i<n1;i++) {
			if(n1%i==0)
				sum+=i;
		}
	if(sum==n1)
		return true;
	else return false;
	}
	
	public static void perfect_all(int n2,int n3) {
	for(int i=n2; i<=n3;i++) {
		if(perfect(i))
			System.out.println(i+ " is perfect");
	}
	
	}
	
	
	
	
		
}
