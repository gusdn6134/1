package �����ݺ�1;

import java.util.Arrays;

public class �������ݺ���_�⺻�̷�3_��ø�ݺ������迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [��ø�ݺ������迭]
		 *   - ��ø�ݺ��� 3 x 4 �� Ȱ����  1�����迭�� 1~12 ���ֱ� 
		 */
		
		

		int arr[] = new int[12];

		
		int a = 0;
		
		for(int i = 0; i < 3; i ++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[a] = a + 1;
				a ++;

			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
