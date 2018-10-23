package java_demo;
/**
 * @author zj
 * @version 1.0
 * ศýิชิหหใ
 * */
public class ThrOperator {
	private static int a;
	private static int b;
	private static int c;

	public static void main(String[] args) {
		a = 1;
		b = 2;
	c = a<b?(a=a+1):(a=a+100);
		System.out.println("a="+a+",b="+b);
		System.out.println("c="+c);
		
	}

}
