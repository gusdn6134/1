package 이차반복3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이차원반복문_프로젝트_틱택토 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * [틱택토]
		 *  
		 * 	조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
		 * 	          아래와같이 만들어보기.
		 *  조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
		 *  조건3) 먼저 한줄을 완성하면 승리
		 *  [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
		 *
		 *=============
		 * [처음화면]
		 * 0,0,0
		 * 0,0,0
		 * 0,0,0
		 * [p1]인덱스 입력 : 6
		 * =============
		 * [1턴]
		 * 0,0,0
		 * 0,0,0
		 * 1,0,0
		 * [p2]인덱스 입력 : 1
		 * =============
		 * [2턴]
		 * 0,2,0
		 * 0,0,0
		 * 1,0,0
		 * [p1]인덱스 입력 : 3
		 * =============
		 * [3턴]
		 * 0,2,0
		 * 1,0,0
		 * 1,0,0
		 * [p2]인덱스 입력 : 2
		 * =============
		 * [4턴]
		 * 0,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1]인덱스 입력 : 0
		 * =============
		 * [5턴]
		 * 1,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1] 승리
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] tic = new int[9];
		
		int p = 0;
		int turn = 1;
		int p1count = 0;
		int p2count = 0;
		int index = 0;
		int r2 = 0;
		
		
		while(true)
		{
			
			System.out.println("[" + turn + "턴]");
			
			for(int i = 0; i < tic.length; i++)
			{
				System.out.print(tic[i] + " ");
				
				if(i % 3 == 2)
				{
					System.out.println();
				}
			}
			
			boolean check = false;
			
			if(turn % 2 != 0)
			{
				System.out.print("p1인덱스 입력 : ");
				index = scan.nextInt();
				
					if(tic[index] == 1 || tic[index] == 2)
					{
						check = true;
						System.out.println("중복");
					}
					
					if(check == false)
					{
						tic[index] = 1;
						turn ++;
					}
					
			}

			
			
			else if(turn % 2 == 0)
			{
				int r = ran.nextInt(9);
				System.out.println("p2인덱스 = " + r);
				
				r2 = r;
				
				if(tic[r] == 2 || tic[r] == 1)
				{
					check = true;
					System.out.println("중복");
				}
				
				if(check == false)
				{
					tic[r] = 2;
					turn --;
					p2count ++;
				}
			}
			
			
		

	
	}
		

	}

}
