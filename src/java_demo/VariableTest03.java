package java_demo;
/**
 * @author zhijie
 * @version 1.0
 * 数据类型转换
 * */
public class VariableTest03 {
	
	private static byte b;

	public static void main(String[] args) {
		//数据类型转换
		double i=666;
		double d;
		d=i;
		System.out.println("i="+i);
		System.out.println("d="+d);
		/*
		 * 强制转换
		 * */
		d=999.99;
		//将double型转换为整型，从大到小精度，强制转换
		//无法四舍五入
		i=d;
		System.out.println("i="+i);
		System.out.println("d="+d);
		b = (byte) d;
		System.out.println("b="+b);
	}

}
