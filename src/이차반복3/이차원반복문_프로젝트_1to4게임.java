package 이차반복3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 이차원반복문_프로젝트_1to4게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [문제]
		 * 
		 * [1to4 게임]
		 * 
		 * [1] arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
		 * [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 
		 * [예]
		 * 
		 * 시작 : { 4 2 3 1 }
		 * 
		 * 인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
		 * 
		 * 인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
	     *
	     * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		
		
		for(int i = 0; i < 4;) {
			int r = ran.nextInt(4);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r + 1;
				i += 1;
			}
		}		
		
		int count = 0;
		
		while(true)
		{
			System.out.println(Arrays.toString(arr));
			
			
			if(count == arr.length)
			{
				break;
			}
			
			System.out.println("가장 작은 수 인덱스 입력 : ");
			int index = scan.nextInt();
			int min = 5;
			

			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			
			if(min == arr[index])
			{
				arr[index] = 9;
				count ++;
			}
			
			
			
		}
	}

}
