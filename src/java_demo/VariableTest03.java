package java_demo;
/**
 * @author zhijie
 * @version 1.0
 * ��������ת��
 * */
public class VariableTest03 {
	
	private static byte b;

	public static void main(String[] args) {
		//��������ת��
		double i=666;
		double d;
		d=i;
		System.out.println("i="+i);
		System.out.println("d="+d);
		/*
		 * ǿ��ת��
		 * */
		d=999.99;
		//��double��ת��Ϊ���ͣ��Ӵ�С���ȣ�ǿ��ת��
		//�޷���������
		i=d;
		System.out.println("i="+i);
		System.out.println("d="+d);
		b = (byte) d;
		System.out.println("b="+b);
	}

}
