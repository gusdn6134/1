package 연습장;

import java.util.Arrays;
import java.util.Random;

public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다. 
		// 중복숫자 해결방법 3가지 
		// 
		// [3] 전체 검사
		
		
		int arr1[] = new int[4]; // 전부 0 저장 
	
		for(int i = 0; i < arr1.length;)
		{
			
			int r = ran.nextInt(4)+1;
			boolean check = false;
			
			for(int j = 0; j < i; j++)
			{
				if(arr1[j] == r)
				{
					check = true;
					break;
				}
				
			}
			
			if(check == false)
			{
				arr1[i] = r;
				i++;
				
			}			
			
		}
		
		
		System.out.println(Arrays.toString(arr1));
	}

}
