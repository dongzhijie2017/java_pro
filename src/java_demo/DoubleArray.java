package java_demo;
/**
 * @author zj
 * @version 1.0
 * ��ά����
 * */
public class DoubleArray {
	
	public static void main(String[] args) {
		//step 1 �����ά����
		int[][] arr=new int[2][2];
		//step 2 ��ʼ��
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=1;
		//step 3 ���ã�Ƕ��forѭ��
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"\t");
				
			}
			
		}
	}

}
