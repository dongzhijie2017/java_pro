package java_demo;
/**
 * @author zj
 * @version 1.0
 * 转义符测试
 * */
class EscapeCharacter {
	
	public static void main(String[] args) {
		//声明一个8进制转义符
		char c1 ='\367';
		System.out.println("c1="+c1);
		//声明一个16进制转义符
		char c2='\u2605';
		System.out.println("c2="+c2);
		//转义字符在字符串中也是起作用的
		String s="\367";
		System.out.println("s="+s);
		String s1="\"";
		System.out.println("s1="+s1);
		String s2="\"我爱你,\'大数据\' \\Death\"";
		System.out.println(s2);
		String s3="\"我爱你,\r\n\t\'大数据\' \n\t\t\\Death\"";
		System.out.println(s3);
		char s4='\041';
		System.out.println(s4);
		char s5='\u0021';
		System.out.println(s5);
	}

}
