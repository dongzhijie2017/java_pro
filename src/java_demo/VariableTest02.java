package java_demo;
/**
 * @author zhijie
 * @version 1.0
 * ������ֵ
 * */
public class VariableTest02 {
	
	private static byte b;
	private static short s;
	private static int i;
	private static long l;
	private static float f;
	private static double d;
	private static float f��;
	private static String st;
	private static boolean boo;

	public static void main(String[] args) {
	b = 110;
	System.out.println("b="+b);
	s = 32767;
	System.out.println("s="+s);
	i = 20180925;
	System.out.println("i="+i);
	l = 666666l;
	System.out.println("l="+l);
	f = (float) (2.0/3.0);
	System.out.println("f="+f);
	d = 2.0/3.0;
	System.out.println("d="+d);
	f�� = 2/3F;
	System.out.println("f��="+f��);
	char c='��';
	System.out.println("c="+c);
	st = "������������";
	System.out.println("st="+st);
	boo = true;
	System.out.println("boo="+boo);
	}
	
	
}
