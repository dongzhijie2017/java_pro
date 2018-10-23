package java_demo;
/**
 * @author zj
 * @version 1.0
 * java·½·¨
 * */

public class MethodDemo {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		c=sum(a,b);
		System.out.println(c);
	}
	public static int sum(int a,int b) {
		
		int sum=a+b;
		return sum;
	}
}
