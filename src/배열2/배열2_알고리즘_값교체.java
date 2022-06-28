package 배열2;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_알고리즘_값교체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };	
		System.out.println("인덱스1 입력 : ");
		int index1 = scan.nextInt();
		
		System.out.println("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		System.out.println(Arrays.toString(arr));
			
		System.out.println();
		
		
		System.out.println("값1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("값2 입력 : ");
		int num2 = scan.nextInt();
		
		temp = -1;
		int temp2 = -1;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(num1 == arr[i])
			{
				temp = i;
			}
			
			if(num2 == arr[i])
			{
				temp2 = i;
			}
		}
		
		if(temp != -1 && temp2 != -1)
		{
			int index3 = arr[temp];
			arr[temp] = arr[temp2];
			arr[temp2] = index3;
		}
		
		else
		{
			System.out.println("값 없음");
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
