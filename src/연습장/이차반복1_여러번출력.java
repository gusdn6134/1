package ������;

import java.util.Random;

public class �����ݺ�1_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		   �������ݺ���
		   
		      ��������(1~100)������ ���� 5���� �̰�
		      �� ���� ������ ����� ���� ��� 
		      
		    [����] 2, 54, 44, 91, 59 ��� ����������
		    
				2 : 1 2 
				54 : 1 2 3 6 9 18 27 54 
				44 : 1 2 4 11 22 44 
				91 : 1 7 13 91 
				59 : 1 59  
		 */
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++)
		{
			int r = ran.nextInt(100)+1;
			System.out.print(r + " : ");
			
			for(int j = 1; j <= r; j++)
			{
				if(r % j == 0)
				{
					System.out.print(j + " ");
				}
				
			}
				
			System.out.println();
				
		}
		
		
	}

}
