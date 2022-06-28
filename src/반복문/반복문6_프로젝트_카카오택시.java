package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 반복문6_프로젝트_카카오택시 {

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
		
		int 위치x = 0;
		int 위치y = 0;
		int 요금 = 0;
		
		 int x = ran.nextInt(21)-10;
		 int y = ran.nextInt(21)-10;
		 
		while(true)
		{
			 System.out.println("목적지 = " + x + " " + y);	 
			
			 
			 System.out.println("1) 방향 설정 [1]동 [2]서 [3]남 [4]북");
			 int 방향 = scan.nextInt();
	
			 System.out.println("2) 속도 설정");
			 int 속도 = scan.nextInt();
			 
			 if(속도 <= 3 && 속도 >= 1)
			 {
				 요금 += 속도;
				 
				 if(방향 == 1)
				 {
					 위치x += 속도;
				 }
				 
				 else if(방향 == 2)
				 {
					 위치x -= 속도;
				 }
				 
				 else if(방향 == 3)
				 {
					 위치y -= 속도;
				 }
				 
				 else if(방향 == 4)
				 {
					 위치y += 속도;
				 }
				 
				 else
				 {
					 System.out.println("잘못입력");
				 }
				 
				 System.out.println("현재 위치x = " + 위치x + " 현재 위치y = " + 위치y);
					
			 }
			 
			 else
			 {
				 System.out.println("속도 잘못 입력");
			 }
			 
			 
			 if(x == 위치x && y == 위치y)
			 {
				 System.out.println("도착");
				 System.out.println("요금 = " + 요금 * 50);
				 break;
 
			 }	
					 
			
			
		}
		

	}

}
