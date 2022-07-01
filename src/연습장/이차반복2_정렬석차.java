package 연습장;

import java.util.Arrays;

public class 이차반복2_정렬석차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[석차 출력]
				성적 순으로 번호와 점수 출력 
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
