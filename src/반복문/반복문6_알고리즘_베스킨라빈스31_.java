package 반복문;

import java.util.Scanner;

public class 반복문6_알고리즘_베스킨라빈스31_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [베스킨라빈스31]
		 *   베스킨라빈스 게임이란, 플레이어 2명이 번갈아가면서
		 *   1~3사이의 숫자를 선택할수있고, 그숫자들을 계속 더해서 
		 *   그누적합이 31에 먼저도달한쪽이 지는게임이다.
		 * 
		 * 
		 * 1) 각 플레이어는 번갈아가면서 1~3을 선택한다.
		 * 2) 만약에 이상한숫자를 입력하면 1~3을 입력할때까지 계속자기 차례이다.
		 * 3) 각 플레이어가 선택한숫자는  total  변수에 계속 누적해서 더한다.
		 * 4) total 이 31이상에 도달하면 승리자를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int total = 0;
		int turn = 0;

		while(true)
		{
			
			if(turn % 2 == 0)
			{		
				System.out.println("p1/ 1 ~ 3 사이 입력");
				int num = scan.nextInt();
					
			 if(num <= 3 && num >= 1)
				{
					total += num;
					turn ++;
					System.out.println(total);
					if(total >= 31)
					{
						System.out.println("p1 승리");
						break;
					}
				}
			 
				if(num > 3 || num < 1)
				{
					System.out.println("다시입력");
					System.out.println(turn);
					System.out.println(total);
				}
			
			}
			
			
			else if(turn % 2 == 1)
			{
				
				System.out.println("p2 / 1 ~ 3 사이 입력");
				int num = scan.nextInt();
					
				if(num <= 3 && num >= 1)
				{
					total += num;
					turn --;
					System.out.println(total);
					
					if(total >= 31)
					{
						System.out.println("p2 승리");
						break;
					}
				}
				
				if(num > 3 || num < 1)
				{
					System.out.println("다시입력");
					System.out.println(turn);
					System.out.println(total);
				}
	
			}
				
		}
	
	}

}
