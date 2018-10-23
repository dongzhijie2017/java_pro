package java_demo;
/**
 * @author zj
 * @version 1.0
 * 位运算
 * */
public class BitOperator {

	private static int a;
	private static int b;

	public static void main(String[] args) {
		a = 10;
		b = 1;
		//主要针对二进制数，需要转换
		System.out.println("位与："+(a&b));
		System.out.println("位或："+(a|b));
		System.out.println("位异或："+(a^b));
		a=7;
		System.out.println("7右移动1："+(a>>1));
		a=7;
		System.out.println("7左移动1："+(a<<1));
		a=-100;
		System.out.println("-100无符号右移4位："+(a>>>4));
		System.out.println("-100 右移4位："+(a>>4));
	}
	
	
}
