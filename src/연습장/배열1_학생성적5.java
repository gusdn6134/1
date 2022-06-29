package 연습장;

import java.util.Scanner;

public class 배열1_학생성적5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  
		 *  numberList = {1001, 1002, 1003, 1004, 1005};
		 *	scoreList  = {  87,   11,   45,   98,   23};
		 * 
		 *  [문제] 학번을 입력받아 성적 출력한다. 
			 		단, 없는학번 입력 시 예외처리 하시오.
			 예)
			 학번 입력 : 1002		성적 : 11점
			 학번 입력 : 1000		해당학번은 존재하지 않습니다. 
		 */	
		Scanner scan = new Scanner(System.in);
		
		 int numberList[] = {1001, 1002, 1003, 1004, 1005};
		 int scoreList[]  = {  87,   11,   45,   98,   23};
		 
		 
		
		 
		 while(true)
		 {
			 int room = -1;
			 
			 System.out.print("학번 입력 : ");
			 int number = scan.nextInt();
			 
			 for(int i = 0; i < numberList.length; i++)
			 {
				 if(number == numberList[i])
				 {
					 room = i;
					 
					 System.out.println("성적 : " + scoreList[room]);
				 }
			 }
			 
			 if(room == -1)
			 {
				 System.out.println("해당학번은 존재하지 않습니다.");
			 }
			  
			 
		 }

	}

}
