package 이차반복1;

public class 이차원반복문_알고리즘_배열비교02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		아래 번호와 점수는 이번학기 중간고사 학생번호와 점수이다. 
		
		아래 검색배열은 학교홈페이지를 통해 검색한 학생번호이다.
		검색한 순서대로 번호와 점수를 출력하시오.
		
		[예시]
			1001 ==> 30
			1003 ==> 45
			1003 ==> 45
			1002 ==> 54
	 */
		
		int[] 번호 = {1001,1002,1003,1004,1005};
		int[] 점수 = {30, 54, 45, 100, 20};
	
		int 검색[] = {1001, 1003, 1003, 1002};
		
		
		
		int index = 0;
		int a = 0;
		
		
		for(int i = 0; i < 검색.length; i++)
		{
			System.out.print(검색[i] + " ==> ");
			
			for(int j = 0; j < 번호.length; j++)
			{
				if(검색[i] == 번호[j])
				{
					index = j;
					
					System.out.print(점수[index] + " ");
					System.out.println();
				}
			}
		}

	}

}
