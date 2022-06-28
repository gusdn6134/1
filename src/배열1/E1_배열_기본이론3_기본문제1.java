package 배열1;

public class E1_배열_기본이론3_기본문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [문제1] 10부터 50까지 array 배열에 저장후 배열안의 모든값을 출력한다.
		 [예] 10 20 30 40 50
	
		 [문제2] array 배열안의 모든값의 합을 출력한다.
		 [예] 150
	 */
		
		
		int array [] = new int [5];
		int num = 10;
		int total = 0;
		
		for(int i = 0; i < 5; i++)
		{
			array[i] = num;
			
			num += 10;
			
			System.out.println(array[i]);
			
			total += array[i];
		}
		
		
		System.out.println("합 = " + total);
		
		
		
	}

}
