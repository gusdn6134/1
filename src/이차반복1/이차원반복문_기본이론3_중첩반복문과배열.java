package 이차반복1;

import java.util.Arrays;

public class 이차원반복문_기본이론3_중첩반복문과배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [중첩반복문과배열]
		 *   - 중첩반복문 3 x 4 을 활용해  1차원배열에 1~12 값넣기 
		 */
		
		

		int arr[] = new int[12];

		
		int a = 0;
		
		for(int i = 0; i < 3; i ++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[a] = a + 1;
				a ++;

			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
