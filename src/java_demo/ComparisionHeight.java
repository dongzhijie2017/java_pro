package java_demo;
import java.util.Scanner;
/**
 *@author zj
 *@version1.0
 * */
public class ComparisionHeight {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("������ߣ���cmΪ��λ������");
		//step2 ������ֵ
		int height_1=scan.nextInt();
		System.out.println("������ߣ���cmΪ��λ������");
		int height_2=scan.nextInt();
		//step3 ����ȽϽ��
		System.out.println("��������Ƿ���ڵ����ҵ����"+(height_1>=height_2));
		System.out.println("��������Ƿ�����ҵ����"+(height_1==height_2));

	}
	
}
