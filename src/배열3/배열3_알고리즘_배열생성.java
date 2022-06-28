package 배열3;

import java.util.Arrays;

public class 배열3_알고리즘_배열생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [문제]
		 *    [4의 배수만 저장]
		 * - 	[조건1] arr 배열에서 4의 배수만 골라 temp 배열에 저장
		 * - 단! temp 의 길이를 4의 배수의 개수 만큼만 설정한다.
		 * - 예) 4의배수 개수는 3개이므로 temp = new int[3];  
		 */
		

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 4 == 0)
			{
				System.out.println(arr[i]);
				count ++;
			}
		}
		
	
		
		temp = new int [count];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			
			if(arr[i] % 4 == 0)
			{
				temp[index] = arr[i];
				index ++;
			}
			
		
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		
	}

}
