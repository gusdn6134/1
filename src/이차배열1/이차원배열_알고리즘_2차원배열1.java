package �����迭1;

import java.util.Arrays;

public class �������迭_�˰���_2�����迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][3];

		int k = 1;
		int sum = 0;
		int sum4 = 0;
		int count = 0;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		
		// ���� 1) ��ü �� ���
		// ���� 1) 450

		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80

		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200

		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr[i].length; j++) 
			{
				sum += arr[i][j];
				
				if(arr[i][j] % 4 == 0)
				{
					count += 1;
					sum4 += arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("��ü �� : " +  sum);
		System.out.println("4�� ����� �� : " +  sum4);
		System.out.println("4�� �����	���� : " +  count);
		
	}

}
