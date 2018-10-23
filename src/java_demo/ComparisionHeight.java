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
		System.out.println("输入身高，以cm为单位，整型");
		//step2 获得身高值
		int height_1=scan.nextInt();
		System.out.println("输入身高，以cm为单位，整型");
		int height_2=scan.nextInt();
		//step3 输出比较结果
		System.out.println("李三身高是否大于等于我的身高"+(height_1>=height_2));
		System.out.println("李三身高是否等于我的身高"+(height_1==height_2));

	}
	
}
