package 연습장;

import java.util.Random;

public class 이차반복1_여러번출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		   이차원반복문
		   
		      랜덤으로(1~100)사이의 숫자 5개를 뽑고
		      각 뽑은 숫자의 약수를 전부 출력 
		      
		    [예시] 2, 54, 44, 91, 59 라고 가정했을때
		    
				2 : 1 2 
				54 : 1 2 3 6 9 18 27 54 
				44 : 1 2 4 11 22 44 
				91 : 1 7 13 91 
				59 : 1 59  
		 */
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++)
		{
			int r = ran.nextInt(100)+1;
			System.out.print(r + " : ");
			
			for(int j = 1; j <= r; j++)
			{
				if(r % j == 0)
				{
					System.out.print(j + " ");
				}
				
			}
				
			System.out.println();
				
		}
		
		
	}

}
