package 이차반복4;

public class 이차원반복문_프로젝트_개수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [개수찾기]
		 
		  	 가장많이 들어있는 숫자개수와
			 가장 적개 들어있는 숫자의 개수의 합을 구하시요.	
			 100 : 1개
			 3   : 5개 	
			 답 : 6		
		 */
		
		
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		
	
	
		int max = 0;
		int maxIndex = 0;
		int min = arr.length;
		int minIndex = 0;

		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;	
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
				}
			}
			
			if(count > max)
			{
				max = count;
				maxIndex = i;
			}
			
			if(count < min)
			{
				min = count;
				minIndex = i;
			}
		}
		
		int total = max + min;
		
		System.out.println(arr[maxIndex] + ": " + max + "개");
		System.out.println(arr[minIndex] + ": " + min + "개");
		System.out.println("답 : " + total + "개");
		
		
	}

}
