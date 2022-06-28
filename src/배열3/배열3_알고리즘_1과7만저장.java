package 배열3;

import java.util.Random;

public class 배열3_알고리즘_1과7만저장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		 * [예] 1,7,7,1,1,7,7			
		 *  
		 */
				
		// 7 의 갯수와 1의 갯수를 지정해서 해보자 7-3개 1-4개
		Random ran = new Random();
		
		int a [] = new int[7];					
				
		int c7 = 0;
		int c1 = 0;
		int i = 0;
				
		while(true)
			{
				int r = ran.nextInt(2);
				
				if(r == 0)
				{
					if(c7 < 3)
					{
						a[i] = 7;
						c7 ++;
						i++;
					}	
				}
					
				if(r == 1 )
				{
					if(c1 < 4)
					{
						a[i] = 1;
						c1 ++;
						i++;
					}
						
				}
					
				if(c7 == 3 && c1 == 4)
				{
					break;
				}
				
			}
		
				
			for( i = 0; i < a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
				
			System.out.println();
			System.out.println("7 = " + c7 + " 1 = " + c1);
				
	}
}

