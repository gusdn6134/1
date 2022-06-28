package 배열1;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
			 scoreList = { 87, 11, 45, 98, 23 };
			 [문제] 학번을 입력받아 성적 출력
			 [정답] 학번 입력 : 1003 성적 : 45점
			 [추가조건]지금은 한번만 입력하면 나오고 끝나지만, 
			 		 내가 원할때까지 확인하고 -1000을 입력하면종료.
		 */
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = { 1001, 1002, 1003, 1004, 1005 };
		int scoreList[] = { 87, 11, 45, 98, 23 };
		
		int room = 0;
		
		
		while(true)
		{
		
			System.out.print("학번입력 : ");
			int num = scan.nextInt();
			
			for(int i = 0; i < 5; i++)
			{
			if(num == numberList[i])
			{
				room = i;
				System.out.println(scoreList[room]);
			}
			
			}
			
			if(num == -1000)
			{
				break;
			}
					
		}
		
	
	}

}
