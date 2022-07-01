package 이차반복3;

public class 이차원반복문_프로젝트_검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 	번호리스트와 점수리스트는 한쌍이다.
	 	이번학기 학생번호와 점수이다. 
	 	1001 번학생은 10점을 받은것이다. 		 		 	
	 	서치리스트는 학생들이 검색한 순서를 저장해놓은것이다. 	 	
	 	서치리스트 의 번호를 넘버리스트에서 찾아서 해당점수를 출력해주면된다. 
	 	만약에 서치리스트의 번호가 넘버리스트에 없으면 "없다" 를 출력하면된다. 		 	
	 	[결과]
	 		1001 ==> 10
	 		1005 ==> 40
	 		103  ==> "없다"
	 		1003 ==> 23
	 		
	 		
	 */
	int scoreList[] = {10, 43, 23, 76 , 40};
	int numberList[] = {1001,1002,1003,1004,1005};		
	int searchList [] = { 1001, 1005, 103 , 1003};
	
	
	int index = 0;
	
	for(int i = 0; i < searchList.length; i++)
	{
		boolean check = false;
		
		for(int j = 0; j < numberList.length; j++)
		{
			if(searchList[i] == numberList[j])
			{
					check = true;
					index = j;
					System.out.println(scoreList[index]);
			}
		}
		if(check == false)
		{
			System.out.println("없다");
		}
	}
	
	}

}
