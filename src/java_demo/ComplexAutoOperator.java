package java_demo;
/**
 * ��ʾ���� �����������Լ�
 * @author zj
 * @version 1.0
 */
public class ComplexAutoOperator {
	
	public static void main(String[] args) {
		
		int a=1;
		int j=0;
		int b=++a*(++a);
		int c=a++*(++a);
		System.out.println("a="+a+"\n b="+b+"\n c="+c);
		//
		for(int i=0;i<=10;i++) {
			
			j=j++;
			System.out.println("j="+j+"ѭ������"+i);
			
		}
		System.out.println("j="+j);
		
	}

}
