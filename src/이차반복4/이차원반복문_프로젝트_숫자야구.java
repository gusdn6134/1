package 이차반복4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이차원반복문_프로젝트_숫자야구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
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
		
		while(true) {
			System.out.println("------------------------");
			int meindex= 0;
			
			while(true)
			{
				if(meindex == 3) 
				{
					break;
				}
				
				System.out.println("입력 : ");
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
					meindex += 1;
					//System.out.println(Arrays.toString(me));
				}
				
				else
				{
					System.out.println("중복 : " + num);
				}
				
			}
			
			System.out.println("------------------------");
			int s = 0;
			int b = 0;
			for(int i = 0; i < 3; i++) 
			{
				for(int j = 0; j < 3; j++) 
				{
					if(me[i] == com[j]) 
					{
						if(i == j)
						{
							s += 1;
						}	
						else
						{
							b += 1;
						}
					}
				}
			}
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			System.out.println("s = " + s + " b =  " + b);
			
			if(s == 3)
			{
				System.out.println("종료.");
				break;
			}
		}
			

	}

}
