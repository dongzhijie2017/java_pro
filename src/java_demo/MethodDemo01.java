package java_demo;

/**
*方法调用说明
*@author zj
*@version 1.0
*/
public class MethodDemo01{
	public static void main(String[] args){
		//定义基本数据类型
		int a=1;
		int b=2;
		int c=0;
		//调用方法
		c=sum(a,b);
		//输出返回值
		System.out.println(c);
		int d=sum(a,b,c);
		System.out.println(d);

		
	}
	public static int sum(int a,int b){
		//因为 返回值类型是int,我们返回了double，需要加强制类型转换
		System.out.println("调用两个参数");
		//return(a+b)*1.0;
		return a+b;
	}
	public static int sum(int a,int b,int c){
		
		System.out.println("调用三个参数");
		return a+b+c;
	}
	
}