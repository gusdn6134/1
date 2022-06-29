package 연습장;

import java.util.Scanner;

public class 반복문_영수증 {

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
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1)
			{
				a ++;
			}
			
			if(sel == 2)
			{
				b ++;
			}
			
			if(sel == 3)
			{
				c ++;
			}
		}
		
		int total = price1 * a + price2 * b + price3 * c;
		
		System.out.println("총금액 = " + total);
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		int change = money - total;
		
		if(money >= total)
		{
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + a + "개");
			System.out.println("2. 새우  버거 : " + b + "개");
			System.out.println("1. 콜     라 : " + c + "개");
			System.out.println("총   금   액 :" + total + "원");
			System.out.println("잔         돈 :" + change + "원");
		}
		else
		{
			System.out.println("현금 부족");
		}
		
		

	}

}
