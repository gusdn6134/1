package 이차배열1;

import java.util.Arrays;
import java.util.Scanner;

public class 이차원배열_알고리즘_2차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		// 문제1) 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		// 문제2) 값을 입력받아 인덱스 2개 출력
		// 예2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		// 문제3) 가장 큰 값의 인덱스 2개 출력
		// 정답3) 2 2
		
		// 문제4) 값 2개를 입력받아 값 교체
		
		
		//문제1
			System.out.println("==============");
			System.out.println("인덱스1 입력 : ");
			int index1 = scan.nextInt(); 
			System.out.println("인덱스2 입력 : ");
			int index2 = scan.nextInt(); 
			System.out.println(arr[index1][index2]);
		
		
		//문제2
			System.out.println("==============");
			System.out.print("값 입력 : ");
			int num = scan.nextInt();
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] == num)
					{
						System.out.println("인덱스1 : " + i + " 인덱스2 : " + j);
					}
				}
			}
			
		//문제3
			System.out.println("==============");
			int max = 0;
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] > max)
					{
						max = arr[i][j];
						index1 = i;
						index2 = j;
					}
				}
			}
			
			System.out.println(index1 + " " + index2);
			
		//문제4
			System.out.println("==============");
			System.out.print("값1 입력 : ");
			int num1 = scan.nextInt();
			System.out.print("값2 입력 : ");
			int num2 = scan.nextInt();
			
			int temp = 0;
			
			if(num1 > num2) 
			{
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = 0; i < arr.length; i++) 
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] == num1 ) 
					{
						temp = arr[i][j];
						index1 = i;
						index2 = j;
					}
					
					if(arr[i][j] == num2) 
					{
						arr[index1][index2] = arr[i][j];
						arr[i][j] = temp;
					}
				}
			}
			
			for(int i = 0; i < arr.length; i++) 
			{
				System.out.println(Arrays.toString(arr[i]));
			}
			
			
			
			
	}

}
