package �����ݺ�2;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���_�⺻�̷�1_�ߺ���������1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ߺ����ڱ��� ==> 1~4�� �迭�� �����ϴµ� ��� �ߺ����� �����Ѵ�. 
		// �ߺ����� �ذ��� 3���� 
		// 
		// [1] ���� 		
		Random ran = new Random();
		
		int arr1[] = new int[4]; // ���� 0 ���� 
		
		for(int i = 0; i < 4; i++) {
			arr1[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr1));
	
		
		
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			int temp = arr1[r1];
			arr1[r1] = arr1[r2];
			arr1[r2] = temp;		
		}
		System.out.println(Arrays.toString(arr1));	
		
	}

}
