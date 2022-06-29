package 연습장;

import java.util.Arrays;

public class 배열3_채팅원리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [문제1] 
		 * 		array1 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 a의  값을 저장한다.
		 * 		[예] array1 = {20,30,40,50,90};
		 * 
		 * [문제2] array2 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 b의 값을 저장한다.
		 * 		[예] array2 = {60,10,20,30,40};
		 */
		
		int array1[] = { 10,20,30,40,50 };
		int a = 90;
		
		int array2[] = { 10,20,30,40,50 };
		int b = 60;
		
		
		for(int i = 0; i < array1.length -1; i++)
		{
			array1[i] = array1[i + 1];
		}
		
		array1[4] = a;
		
		System.out.println(Arrays.toString(array1));
		
		
		int index = 4;
		
		for(int i = 0; i < array1.length -1; i++)
		{
			array2[index] = array2[index - 1];
			index --;
		}
		
		array2[0] = b;
		
		System.out.println(Arrays.toString(array2));

	}

}
