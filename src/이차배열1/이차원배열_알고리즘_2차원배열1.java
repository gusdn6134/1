package 이차배열1;

import java.util.Arrays;

public class 이차원배열_알고리즘_2차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][3];

		int k = 1;
		int sum = 0;
		int sum4 = 0;
		int count = 0;
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		
		// 문제 1) 전체 합 출력
		// 정답 1) 450

		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80

		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200

		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr[i].length; j++) 
			{
				sum += arr[i][j];
				
				if(arr[i][j] % 4 == 0)
				{
					count += 1;
					sum4 += arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("전체 합 : " +  sum);
		System.out.println("4의 배수의 합 : " +  sum4);
		System.out.println("4의 배수의	개수 : " +  count);
		
	}

}
