package java_demo;
/**
 *@author zj
 *@version 1.0
 *数组的初始化和变量声明
 * */
public class ArrayDemo2 {
	
	public static void main(String[] args/*参数也相当于一个数组*/) {
		//数组定义--并进行静态初始化
		int[] arr=new int[] {10000,10086,10001};
		int i=0;
		//通过while循环数组调用
		while(i<arr.length) {
			
			System.out.println(arr[i]);
			i++;
		}
		int[] arr2={10000,10086,10001};
		System.out.println(arr2.length);
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr[j]);
		}
			
	}
}
