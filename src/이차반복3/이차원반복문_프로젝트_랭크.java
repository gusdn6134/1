package �����ݺ�3;

import java.util.Arrays;


public class �������ݺ���_������Ʈ_��ũ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		[��ŷ]
			���� �л�����Ʈ�� ������ ���� ����� �����Ͻÿ�.
			
			[����]
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
