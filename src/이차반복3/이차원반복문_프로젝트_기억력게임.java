package 이차반복3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이차원반복문_프로젝트_기억력게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  배열3_프로젝트_기억력게임(영상 o)
		  [기억력 게임]
		  
		  1. 같은 숫자가 적혀있는 카드 2장씩 5세트가있다. (총10장)
		  2. front 는 카드를 엎어논 상태를 뜻한다. 
		  3. 먼저 front 를 셔플한다. 
		  4. front 에 있는 카드 2개를 선택한다. (마우스가없으므로 인덱스로 선택)
		  5. 선택한카드 2장의 내용이 같으면  back 에 복사해서 맞춘걸 표시한다. 
		     back에 모든 글자 가 채워지면 게임은 종료된다.
		     
		  6. 같은 인덱스 선택할수없다. 
		  7. 이미 선택한 자리를 또 선택할수없다. 
		    
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int front[] = {10,10,20,20,30,30,40,40,50,50};
		int back[] = new int[10];
		
		
		
		for(int i = 0; i < front.length; i++)
		{
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
			
		}
		
		System.out.println(Arrays.toString(front));
		
		
		int count = 0;
		boolean check[] = new boolean[10];
		
		while(true)
		{	
			System.out.println(Arrays.toString(back));
			
			if(count == 5)
			{
				break;
			}
			
			System.out.println("첫번째 카드 선택 : ");
			int num1 = scan.nextInt();
			System.out.println("두번째 카드 선택 : ");
			int num2 = scan.nextInt();
			
			if(check[num1] == false && check[num2] == false)
			{
					
			if(front[num1] == front[num2])
			{
				check[num1] = true;
				check[num2] = true;
				
				back[num1] = front[num1];
				back[num2] = front[num2];
				count ++;
				
			}
			
			else if(front[num1] != front[num2])
			{
				System.out.println("틀림");
			}
			
			}
			
			else
			{
				System.out.println("중복");
			}
				
		}
		
		
		
	}

}
