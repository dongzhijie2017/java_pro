package java_demo;
/**
 *@author zj
 *@version 1.0
 *����ĳ�ʼ���ͱ�������
 * */
public class ArrayDemo {
	
	public static void main(String[] args/*����Ҳ�൱��һ������*/) {
		int[] arr=new int[4];
		//int a;
		//arr=new int[4];
		arr[0]=10000;
		arr[1]=10086;
		arr[2]=10001;
		arr[3]=10101;
		System.out.println(arr[0]);
		System.out.println("����ĳ���"+arr.length);
		//�������
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}
}
