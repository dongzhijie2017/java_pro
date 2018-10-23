package java_demo;
/**
 *@author zj
 *@version 1.0
 *数组的初始化和变量声明
 * */
public class ArrayDemo {
	
	public static void main(String[] args/*参数也相当于一个数组*/) {
		int[] arr=new int[4];
		//int a;
		//arr=new int[4];
		arr[0]=10000;
		arr[1]=10086;
		arr[2]=10001;
		arr[3]=10101;
		System.out.println(arr[0]);
		System.out.println("数组的长度"+arr.length);
		//数组调用
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
	}
}
