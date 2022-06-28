package 배열2;

import java.util.Arrays;

public class 배열2_프로젝트_배열연산자게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[테스트]
		[연산자 문제]
			a 와 b 그리고 op의 연산자 를 뜻한다. 
			a 와 b 를 연산자의 결과대로 total 에 저장하면된다.
			단, 연산자는 문자이므로 숫자로 표시한다. 
		-----------------------------
			[연산자 의 의미]
			0 => 더하기
			1 => 빼기
			2 => 곱하기
		
		
		[예시]
			a = 3
			b = 8
			op = 0 // 0은 더하기이므로 
			total = {11,0,0,0,0,0};
			
		[예시]
			a = 5
			b = 6
			op = 1 // 1은 빼기이므로
			total = {11,-1,0,0,0,0}
		
	*/
		
		int a[] = {3,5,7,6,4,9};
		int b[] = {8,6,8,5,5,3};		
		int op[] = {0,1,0,2,2,0};	
		int total [] = new int[6];
		
		
		for(int i = 0; i < a.length; i++)
		{
			if(op[i] == 0)
			{
				total[i] = a[i] + b[i];
			}
			
			if(op[i] == 1)
			{
				total[i] = a[i] - b[i];
			}
			
			if(op[i] == 2)
			{
				total[i] = a[i] * b[i];
			}
		}
		
		System.out.println(Arrays.toString(total));

	}

}
