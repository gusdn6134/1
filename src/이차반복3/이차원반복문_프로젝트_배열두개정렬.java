package 이차반복3;

import java.util.Arrays;

public class 이차원반복문_프로젝트_배열두개정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [정렬]
		     두 배열을 한나로 합치고 오름차순으로정렬하시오.	
			 예) 1,2,3,5,7,8,9,10,12,15,19,20
		 */	
		
		
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};
		
		
		int temp[] = new int[arr1.length + arr2.length];
	
		int index = 0;
		
		
		for(int i = 0; i < arr1.length; i++)
		{
			temp[index] = arr1[i];
			index ++;
			temp[index] = arr2[i];
			index ++;	
		}
		
		
		System.out.println(Arrays.toString(temp));
		
		// [9, 15, 10, 12, 3, 1, 2, 5, 20, 7, 19, 8]
		
		for(int i = 0; i < temp.length-1; i++)
		{	
			int min = 21;
			
			for(int j = i; j < temp.length; j++)
			{
				if(temp[j] < min)
				{
					min = temp[j]; // 1
					temp[j] = temp[i]; // 9
					temp[i] = min; // 1
				}
			}
		}
		
		
		System.out.println(Arrays.toString(temp));
	}

}
