package 이차반복4;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문_프로젝트_합집합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
  		arr1에 랜덤(1~20)을 10개 저장한다.
  		arr2에 랩덤(1~20)을 10개 저장한다. 
  		
  		arr1과 arr2의 모든값을 temp1 에저장한다. 
  		
		temp2는 temp1 에서 중복되지않는숫자만 저장한다. 
 */
		Random ran = new Random();
		
		int arr1[] = new int[10];
		int arr2[] = new int[10];		
		int temp1[] =new int[20];		
		int temp2[] = new int[20];
		
		
		int index = 0;
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = ran.nextInt(20)+1;
			arr2[i] = ran.nextInt(20)+1;
			
			temp1[index] = arr1[i];
			index ++;
			temp1[index] = arr2[i];
			index ++;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(temp1));
		
		
		int index2 = 0;
		
		for(int i = 0; i < temp1.length; i++)
		{
			boolean check = false;
			
			for(int j = 0; j < temp2.length; j++)
			{
				if(temp1[i] == temp2[j])
				{
					check = true;
				}
			}
			
			if(check == false)
			{
				temp2[index2] = temp1[i];
				index2 ++;
			}
		}
		
		System.out.println(Arrays.toString(temp2));

	}

}
