package �����ݺ�2;

import java.util.Arrays;

public class �������ݺ���_�˰���_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [����]
		 * 
		 * 1. �ε��� 0���� �������� �˻��Ѵ�.
		 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
		 * 3. �ε��� 1�����Ѵ�.
		 * 4. [1~3]�� ������ �ݺ��Ѵ�.
		 * ��)
		 * 10, 50, 30, 40, 80, 19   ==> 80�� ã�Ƴ��� ��ȯ�Ѵ�.
		 * 80, 50, 30, 40, 10, 19   ==> 50�� �������� �̹� ����ũ��.
		 * 80, 50, 30, 40, 10, 19   ==> 40�� ã�Ƴ��� ��ȯ�Ѵ�.
		 * 80, 50, 40, 30, 10, 19   ==> 30�� �������� �̹� ����ũ��.
		 * 80, 50, 40, 30, 10, 19   ==> 19�� ã�Ƴ��� ��ȯ�Ѵ�.
		 * 80, 50, 40, 30, 19, 10
		 */
		

		int[] score = {10, 50, 30, 40, 80, 19};
		
		int max = 0;
		int num = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			for(int j = i; j < score.length; j++)
			{
				
				if(score[j] > max)
				{
					max = score[j]; // 80
					num = j; // 4
				}
			}
		
			score[num] = score[i];
			score[i] = max;
		
			
			max = 0;
 
		}
		
		System.out.println(Arrays.toString(score));
		
		
	}

}
