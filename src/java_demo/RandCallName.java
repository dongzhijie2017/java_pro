package java_demo;
/**
 * @author zj
 * @version 1.0
 * ���������
 * */
import java.util.Random;
public class RandCallName {
	
	public static void main(String[] args) {
		//step 1 �������飬�洢ѧ������
		String[] Names= {"jack","java","javac","C","Python","Code","����","����"};
		//������ã�ͨ������
		//����һ���������
		int i=0;
		int num=10;
		Random rand=new Random();
		//����һ�����������0-7��
		while(i<num) {
		int index=rand.nextInt(8);
		System.out.println(Names[index]);
		i++;
		}
		
	}

}
