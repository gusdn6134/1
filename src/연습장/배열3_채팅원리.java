package ������;

import java.util.Arrays;

public class �迭3_ä�ÿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [����1] 
		 * 		array1 �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� a��  ���� �����Ѵ�.
		 * 		[��] array1 = {20,30,40,50,90};
		 * 
		 * [����2] array2 �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� b�� ���� �����Ѵ�.
		 * 		[��] array2 = {60,10,20,30,40};
		 */
		
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		
		for(int i = 0; i < array1.length -1; i++)
		{
			array1[i] = array1[i + 1];
		}
		
		array1[4] = a;
		
		System.out.println(Arrays.toString(array1));
		
		
		int index = 4;
		
		for(int i = 0; i < array1.length -1; i++)
		{
			array2[index] = array2[index - 1];
			index --;
		}
		
		array2[0] = b;
		
		System.out.println(Arrays.toString(array2));

	}

}
