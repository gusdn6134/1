package 연습장;

import java.util.Arrays;
import java.util.Random;

public class 배열3_1과7만저장 {

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
		
		int c1 = 0;
		int c7 = 0;
		
		int i = 0;
		
		
		while(true)
		{
			int r = ran.nextInt(2);
			
			
			if(c1 < 4)
			{
				
			if(r == 0)
			{
				a[i] = 1;
				c1 ++;
				i ++;
			}
			
			}
			
			if(c7 < 3)
			{
				
			if(r == 1)
			{
				a[i] = 7;
				c7 ++;
				i ++;
			}
			
			}
			
			if(c1 == 4 && c7 == 3)
			{
				break;
			}
			
		
		}
		
		System.out.println(Arrays.toString(a));

	}

}
