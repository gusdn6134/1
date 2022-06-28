package 이차반복1;

import java.util.Random;

public class 이차원반복문_알고리즘_약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		[이차원반복문]
		
			랜덤으로(1~6)사이의 숫자 5개를 뽑고
			뽑은숫자를 그숫자만큼 출력 
			
			
		[예시] 4, 3, 6, 6, 5 가 나왔다고 가정했을때,
			
			4 4 4 4 
			3 3 3 
			6 6 6 6 6 6 
			6 6 6 6 6 6 
			5 5 5 5 5 
	 */
		
		Random ran = new Random();
		
		
		
		for(int i = 0; i < 5; i++)
		{
			int r = ran.nextInt(6)+1;
			System.out.print(r + " ");
			
			for(int j = 0; j < r -1 ; j++)
			{
				System.out.print(r + " ");
				
			}
			
			System.out.println();
		}
		
	
		

	}

}
