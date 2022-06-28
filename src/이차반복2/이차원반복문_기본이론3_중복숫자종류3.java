package 이차반복2;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문_기본이론3_중복숫자종류3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중복숫자금지 ==> 1~4를 배열에 저장하는데 섞어서 중복없이 저장한다. 
				// 중복숫자 해결방법 3가지 
				// 
				// [3] 전체 검사
				Random ran = new Random();
				int arr1[] = new int[4]; // 전부 0 저장 
				
				for(int i = 0; i < 4;) 
				{
					int r = ran.nextInt(4) + 1;
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
						i += 1;
					}
				}
				System.out.println(Arrays.toString(arr1));
				
				

	}

}
