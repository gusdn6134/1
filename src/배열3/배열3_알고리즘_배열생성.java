package �迭3;

import java.util.Arrays;

public class �迭3_�˰���_�迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [����]
		 *    [4�� ����� ����]
		 * - 	[����1] arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� ����� ���� ��ŭ�� �����Ѵ�.
		 * - ��) 4�ǹ�� ������ 3���̹Ƿ� temp = new int[3];  
		 */
		

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 4 == 0)
			{
				System.out.println(arr[i]);
				count ++;
			}
		}
		
	
		
		temp = new int [count];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			
			if(arr[i] % 4 == 0)
			{
				temp[index] = arr[i];
				index ++;
			}
			
		
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		
	}

}
