package 이차반복3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이차원반복문_프로젝트_max게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [max게임]
		 * 
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 * 입력 : 24 ==> 최대값이 아니므로 아무일안생김
		 */
		//[심화] 랜덤으로 인덱스 값을 고르는데, 동일한 번호는 다시 나오지 않게 설정
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
			
		int[] arr = {11, 87, 42, 100, 24};
		
		int count = 0;
		int max = 0;
		
		boolean [] check = new boolean[5];
		
		
		while(true)
		{
			max = 0;
			
			int r = ran.nextInt(5);
			
			if(count == arr.length)
			{
				break;
			}
			
			if(check[r] == false)
			{
				check[r] = true;	
				
				for(int i = 0; i <arr.length; i++)
				{
					if(arr[i] > max)
					{
						max = arr[i];
					}
				}
				
				
				if(arr[r] == max)
				{
					arr[r] = 0;
					System.out.println(Arrays.toString(arr));
					count ++;
					
					for(int j = 0; j < 5; j++) {
						check[j] = false;
						}
				}
			}
			
			
			
		}
		

	}

}
