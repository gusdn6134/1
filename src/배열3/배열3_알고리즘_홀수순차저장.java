package �迭3;

import java.util.Arrays;

public class �迭3_�˰���_Ȧ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [����1] ���� ����Ʈ�� �̿��ؼ� arr1 �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		 * [��]   b = { 0, 49, 51, 0, 17 }
		 * 
		 * [����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		 * [����] ��ġ�� �տ��� ���� �����Ѵ�. 
		 * [��]   c = { 49, 51, 17, 0, 0 }
		 */
		
		int arr1[] = { 10, 49, 51, 36, 17 };
		
		int b[] = { 0,0,0,0,0 };
	
		int c[] = { 0,0,0,0,0 };
		
		
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] % 2 != 0)
			{
				b[i] = arr1[i];
			}
		}
		
		
		System.out.println(Arrays.toString(b));
		
		
		
		int index = 0;
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] % 2 != 0)
			{
				c[index] = arr1[i];
				index ++;
			}
		}
		
		System.out.println(Arrays.toString(c));

	}

}
