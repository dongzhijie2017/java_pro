package java_demo;
/**
 *@author zj
 *@version 1.0
 *����ĳ�ʼ���ͱ�������
 * */
public class ArrayDemo2 {
	
	public static void main(String[] args/*����Ҳ�൱��һ������*/) {
		//���鶨��--�����о�̬��ʼ��
		int[] arr=new int[] {10000,10086,10001};
		int i=0;
		//ͨ��whileѭ���������
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
