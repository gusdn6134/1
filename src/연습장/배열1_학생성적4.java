package 연습장;

public class 배열1_학생성적4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	numberList = {1001, 1002, 1003, 1004, 1005};
			scoreList  = {  87,   11,   45,   98,   23};
		 *  [문제] 1등학생의 학번과 성적 출력한다.
		 *  [정답] 1004번(98점)
		 */
		
		int numberList[] = {1001, 1002, 1003, 1004, 1005};
		int scoreList[]  = {  87,   11,   45,   98,   23};

		int maxnumber = 0;
		int maxscore = 0;
		
		for(int i = 0; i < scoreList.length; i++)
		{
			if(scoreList[i] > maxscore)
			{
				maxscore = scoreList[i];
				maxnumber = numberList[i];
			}
		}
		
		System.out.println(maxnumber + "번 " + maxscore + "점");
		
	}

}
