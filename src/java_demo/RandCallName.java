package java_demo;
/**
 * @author zj
 * @version 1.0
 * 随机点名器
 * */
import java.util.Random;
public class RandCallName {
	
	public static void main(String[] args) {
		//step 1 声明数组，存储学生姓名
		String[] Names= {"jack","java","javac","C","Python","Code","张三","黎明"};
		//数组调用，通过索引
		//生成一个随机对象
		int i=0;
		int num=10;
		Random rand=new Random();
		//生成一个随机索引（0-7）
		while(i<num) {
		int index=rand.nextInt(8);
		System.out.println(Names[index]);
		i++;
		}
		
	}

}
