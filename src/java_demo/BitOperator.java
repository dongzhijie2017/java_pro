package java_demo;
/**
 * @author zj
 * @version 1.0
 * λ����
 * */
public class BitOperator {

	private static int a;
	private static int b;

	public static void main(String[] args) {
		a = 10;
		b = 1;
		//��Ҫ��Զ�����������Ҫת��
		System.out.println("λ�룺"+(a&b));
		System.out.println("λ��"+(a|b));
		System.out.println("λ���"+(a^b));
		a=7;
		System.out.println("7���ƶ�1��"+(a>>1));
		a=7;
		System.out.println("7���ƶ�1��"+(a<<1));
		a=-100;
		System.out.println("-100�޷�������4λ��"+(a>>>4));
		System.out.println("-100 ����4λ��"+(a>>4));
	}
	
	
}
