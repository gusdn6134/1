package 이차반복1;

public class 이차원반복문_알고리즘_구구단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"%d X %d = %d",i,j,i*j
		// 문제) 구구단 출력 아래와같이 9단까지출력해보세요.
		/*
		 * === 2단 ===
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 * === 3단 ===
		 * 3 X 1 = 3
		 * 3 X 2 = 6
		 * ...
		 * ...
		 */
		
		
		
		for(int i = 2; i < 10; i++)
		{
			System.out.println("===" + i + "단===");
			for(int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %d \n", i, j, i * j);
				
			}
		}

	}

}
