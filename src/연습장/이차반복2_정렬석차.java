package ������;

import java.util.Arrays;

public class �����ݺ�2_���ļ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[���� ���]
				���� ������ ��ȣ�� ���� ��� 
		*/
		
		int[] numList = {1001, 1002, 1003, 1004};
		int[] scoreList = { 87, 42,  11, 98};
		
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < scoreList.length; i++)
		{
			
			for(int j = i; j < scoreList.length; j++)
			{
				if(scoreList[j] > max)
				{
					max = scoreList[j];
					index = j;
					
				}
			}
			
			int temp = numList[i];
			numList[i] = numList[index];
			numList[index] = temp;
			
			scoreList[index] = scoreList[i];
			scoreList[i] = max;
			
			max = 0 ;
		}
		
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(scoreList));
		
	}

}
