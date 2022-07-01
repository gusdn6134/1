package 이차반복3;

import java.util.Arrays;
import java.util.Scanner;

public class 이차원반복문_프로젝트_회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  [회원가입] 동영상으로 설명
		  1. 추가 = > ID가 있는지 확인하고 없으면 회원가입
		  2. 삭제(값) => 값이 들어있는 인덱스 찾아 삭제하고 그 뒷 값 앞으로 당김
		
	 	 */
		
		Scanner scan = new Scanner(System.in);	
		int[] arr = {0, 0, 0, 0, 0};
		int index = 0;
		
		while(true)
		{
			System.out.println(Arrays.toString(arr));
			System.out.println("(1)추가 (2)삭제 (0)종료");
			int sel = scan.nextInt();
			
			
			if(sel == 0)
			{
				System.out.println("종료");
				break;
			}
			
			else if(sel == 1)
			{
				if(index < arr.length)
				{
					
					System.out.print("추가할 아이디 입력 : ");
					int id = scan.nextInt();
					
					boolean check = false;
					
					for(int i = 0; i < arr.length; i++)
					{	
						if(arr[i] == id)
						{
							check = true;
						}
					}
					
					if(check == false)
					{
						arr[index] = id;
						index ++;
						System.out.println(id + "님 회원가입 완료");	
					}
					
					else
					{
						System.out.println("중복 아이디");
					}
				}
				
				else
				{
					System.out.println("더 이상 가입 불가");
			
				}
		
				
			}
			
			else if(sel == 2)
			{
				System.out.println("삭제할 id 입력 : ");
				int id = scan.nextInt();
				
				int room = -1;
				
				for(int i = 0; i < arr.length; i++)
				{
					if(arr[i] == id)
					{
						room = i;
					}
				}
				
				if(room != -1)
				{
					
					for(int i = 0; i < index - 1; i++)
					{
						if(i >= room)
						{
							arr[i] = arr[i + 1];
						}
					}
					
					arr[index - 1] = 0;
					index -- ;
					System.out.println("삭제 완료");
				}
				
				else
				{
					System.out.println("삭제 불가");
				}
				
			}
			
		}
		

	}

}
