package ������;

import java.util.Arrays;
import java.util.Random;

public class �迭3_1��7������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 * [����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		 * [��] 1,7,7,1,1,7,7			
		 *  
		 */
				
		// 7 �� ������ 1�� ������ �����ؼ� �غ��� 7-3�� 1-4��
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
