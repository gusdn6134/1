package �����ݺ�2;

import java.util.Arrays;

public class �������ݺ���_������Ʈ_��ũ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[��ŷ]
			���� �л�����Ʈ�� ������ ���� ����� �����Ͻÿ�.
			
			[����]
				87 ==> 2
				42 ==> 3
				11 ==> 4
				98 ==> 1
				
			rankList = {2,3,4,1}
	*/
		
		int[] scoreList = { 87, 42,  11, 98};
		int[] rankList = new int[4];
		
		int max = 0;
		int count = 0;
		int index = 0;
		int num = 1;
		

			for(int i = 0; i < scoreList.length; i++)
			{
				for(int j = 0; j < scoreList.length; j++)
				{
					if(scoreList[i] > scoreList[j])
					{
						rankList[i] = 1;
					}
					
				}
		
				
			}
			
			
			
		System.out.println(Arrays.toString(rankList));
		
	}

}
