package 반복문;

import java.util.Scanner;

public class 반복문4_프로젝트_영수증 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * [영수증 출력]
		 * 1. 5번 주문을 받는다.
		 * 2. 주문이 끝난 후, 돈을 입력받는다.
		 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("주문 : ");
			int 메뉴 = scan.nextInt();
	
			
			if(메뉴 == 1)
			{
				a ++;
			}
			
			if(메뉴 == 2)
			{
				b ++;
			}
			
			if(메뉴 == 3)
			{
				c ++;
			}
		}
		
		
		int total = price1 * a + price2 * b + price3 * c;
		
		System.out.println("총금액 = " + total);
		System.out.println("현금 입력 : " );
		int num = scan.nextInt();
		
		int change = num - total;
		
		if(change >= 0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + a + "개");
			System.out.println("2. 새우    버거 : " + b + "개");
			System.out.println("3.콜         라 : " + c + "개");
			System.out.println("4. 총   금   액 : " + total + "원");
			System.out.println("5. 잔         돈 : " + change + "원" );
		//만약 거스름돈이 < 0이면 계산 불가능	
		}else {
			System.out.println("현금이 부족합니다");
		}
		

	}

}
