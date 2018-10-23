package java_demo;
/**
 *@author zj
 *@version 1.0
 * continue
 * */

public class ContinueTest {

	public static void main(String[] args) {
		int i=0;
		for(i=0;i<5;i++) {
			if(i%2==0) {
			
			continue;
			}
			System.out.println(i);
		}
		//System.out.println(i);
	}
}
