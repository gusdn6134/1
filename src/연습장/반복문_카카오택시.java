package 연습장;

import java.util.Random;
import java.util.Scanner;

public class 반복문_카카오택시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * [카카오 택시]
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 * 5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다.
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(21)-10;
		int y = ran.nextInt(21)-10;
		
		int x2 = 0;
		int y2 = 0;
		
		int 속도 = 0;
		int 방향 = 0;
		int 요금 = 0;
		
		while(true)
		{
			
			System.out.println("목적지 x = " + x + " 목적지 y = " + y);
			System.out.println("현재위치 x = " + x2 + " 현재위치 y = " + y2);
			System.out.println("속도 = " + 속도 + " 방향 = " + 방향);
			
			System.out.println("1)속도 설정 2)방향 설정 3)이동하기 0)종료");
			int sel = scan.nextInt();
			
			if(sel == 0)
			{
				System.out.println("종료");
				break;
			}
			
			else if(sel == 1)
			{
				System.out.print("속도 1 ~ 3 입력 : ");
				속도 = scan.nextInt();
				요금 += 속도;
				
				if(속도 < 1 && 속도 > 3)
				{
					속도 = 1;
				}
			}
		
			else if(sel == 2)
			{
				System.out.print("방형 설정  동(1)서(2)남(3)북(4) : ");
				방향 = scan.nextInt();
				
				if(방향 < 1 && 방향 > 3)
				{
					방향 = 1;
				}	
			}
			
			else if(sel == 3)
			{
				if(방향 == 1)
				{
					x2 += 속도;
				}
				
				if(방향 == 2)
				{
					x2 -= 속도;
				}
				
				if(방향 == 3)
				{
					y2 -= 속도;
				}
				
				if(방향 == 4)
				{
					y2 += 속도;
				}
			}
			
			if(x == x2 && y == y2)
			{
				System.out.println("목적지 도착");
				System.out.println("요금 = " + 요금 * 50 + "원");
				x = ran.nextInt(21)-10;
				y = ran.nextInt(21)-10;
			}
			
		}
		
		

	}

}
