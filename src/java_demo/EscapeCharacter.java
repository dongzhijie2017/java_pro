package java_demo;
/**
 * @author zj
 * @version 1.0
 * ת�������
 * */
class EscapeCharacter {
	
	public static void main(String[] args) {
		//����һ��8����ת���
		char c1 ='\367';
		System.out.println("c1="+c1);
		//����һ��16����ת���
		char c2='\u2605';
		System.out.println("c2="+c2);
		//ת���ַ����ַ�����Ҳ�������õ�
		String s="\367";
		System.out.println("s="+s);
		String s1="\"";
		System.out.println("s1="+s1);
		String s2="\"�Ұ���,\'������\' \\Death\"";
		System.out.println(s2);
		String s3="\"�Ұ���,\r\n\t\'������\' \n\t\t\\Death\"";
		System.out.println(s3);
		char s4='\041';
		System.out.println(s4);
		char s5='\u0021';
		System.out.println(s5);
	}

}
