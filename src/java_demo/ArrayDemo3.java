package java_demo;
/**
 * @author zj
 * @version 1.0
 * 数组内元素最大值
 * */

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,2,18,9,8,-1};
		//定义一个整型值，存放最大值
		int max=0;
		int min=0;
		//逐个比较，找出最大值
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				System.out.println("比较过程"+max);
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
			System.out.println(max);
			System.out.println(min);
	}
}
