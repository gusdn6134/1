package 연습장;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		/*
		 * [숫자 야구 게임]
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 *    예) 1,1,1 
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 * 
		 */
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		
		while(true)
		{
			int meindex = 0;
			
			while(true)
			{
				if(meindex == 3)
				{
					break;
				}
				
				System.out.print("입력 : ");
				int num = scan.nextInt();
				
				boolean check = false;
				
				for(int i = 0; i < meindex; i++)
				{
					if(num == me[i])
					{
						check = true;
						break;
					}
				}
				
				if(check == false)
				{
					me[meindex] = num;
					meindex ++;
				}
				
				else
				{
					System.out.println("중복");
				}
			}
			
			System.out.println("------------------------");
			
			int s = 0;
			int b = 0;
			
			for(int i = 0; i < me.length; i++)
			{
				for(int j = 0; j < me.length; j++)
				{
					if(me[i] == com[j])
					{
						if(i == j)
						{
							s ++;
						}
						
						else
						{
							b ++;
						}
					}
				}
			}
			
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			System.out.println("s = " + s + " b =  " + b);
			
			if(s == 3)
			{
				System.out.println("종료");
				break;
			}
			
			
		}

	}
}

