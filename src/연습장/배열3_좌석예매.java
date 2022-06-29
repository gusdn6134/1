package 연습장;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_좌석예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # 영화관 좌석예매
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 금액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 총금액 : 24000원
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		
		int ticket = 0;
		int fee = 12000;
		
		while(true)
		{
			System.out.println(Arrays.toString(seat));
			
			System.out.print("좌석선택 : ");
			int sel = scan.nextInt();
			
			if(sel == -1)
			{
				break;
			}
			
			else if(sel >= 0 && sel < 7)
			{
				if(seat[sel] == 0)
				{
					seat[sel] = 1;
					ticket ++;
				}
				
				else {
					System.out.println("이미 예매가 완료된 자리입니다.");
				}
			}	
			
			else
			{
				System.out.println("좌석번호를 확인해주세요.");
			}
		}
		
		System.out.println("총금액 = " + ticket * fee);
		

	}

}
