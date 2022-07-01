package 이차반복3;

import java.util.Arrays;


public class 이차원반복문_프로젝트_랭크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		[랭킹]
			다음 학생리스트의 점수를 보고 등수를 저장하시오.
			
			[예시]
				87 ==> 2
				42 ==> 3
				11 ==> 4
				98 ==> 1
				
			rankList = {2,3,4,1}
	*/
		
	
		int[] scoreList = { 87, 42,  11, 98};
	      //              { 87, 42,  11, 98};
	      //  			  {1 , 2 ,3  0 ,}
	      int[] rankList = new int[4];
	      
	      for(int i=0;i<scoreList.length;i++) 
	      {
	         for(int j=0;j<scoreList.length;j++)
	         {
	            if(scoreList[i]<scoreList[j]) 
	            {
	               rankList[i]+=1;
	            }
	         }
	      }
	      
	      for(int i=0;i<rankList.length;i++)
	      {
	         rankList[i]+=1;
	      }
	      System.out.println(Arrays.toString(rankList));
	
	}
	

}
