package java_demo;
/**
 * @author zj
 * @version 1.0
 * ������Ԫ�����ֵ
 * */

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,2,18,9,8,-1};
		//����һ������ֵ��������ֵ
		int max=0;
		int min=0;
		//����Ƚϣ��ҳ����ֵ
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				System.out.println("�ȽϹ���"+max);
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
			System.out.println(max);
			System.out.println(min);
	}
}
