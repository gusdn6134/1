package 이차반복1;

public class 이차원반복문_알고리즘_그래프2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		위 데이터는 학생 6명의 점수이다.	
		위 데이터를 그래프로 표현해볼려고한다.		
		 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.		
		예)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
	*/
		
		int scoreList[] = {31, 76, 54, 2, 100, 23};
	
		for(int i = 0; i < scoreList.length; i++)
		{
			int a = scoreList[i] / 10;
			System.out.print(scoreList[i] + " ==> ");
			
			for(int j = 0; j < a; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
	
		

	}

}
