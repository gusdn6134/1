package 이차반복4;

import java.util.Arrays;
import java.util.Scanner;

public class 이차원반복문_프로젝트_숫자야구 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		int index = 0;
		int count = 0;
		
		
		
		while(true)
		{
			
			System.out.println("숫자 입력 : ");
			int num = scan.nextInt();
			
			boolean check = false;
			
			for(int i = 0; i <= index; i ++)
			{
				if(me[i] == num)
				{
					check = true;
					
					System.out.println("중복 다시 입력");
				}
			}
			
			if(check == false)
			{
				me[index] = num;
				index ++;

			}
		
			
			if(index == me.length) {
				System.out.println(Arrays.toString(me));
				break;
			}
		}
		
		int ball = 0;
		int strike = 0;
		
		
		for(int i = 0; i < com.length; i++)
		{
			for(int j = 0; j < me.length; j++)
			{
				if(com[i] == me[j])
				{
					if(i == j)
					{
						strike ++;
					}
					
					else
					{
						ball ++;
					}
				}
			}
		}
	
		System.out.println("strike : " + strike +" ball : " + ball);
		

	}

}
