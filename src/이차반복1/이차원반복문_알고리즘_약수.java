package �����ݺ�1;

import java.util.Random;

public class �������ݺ���_�˰���_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		[�������ݺ���]
		
			��������(1~6)������ ���� 5���� �̰�
			�������ڸ� �׼��ڸ�ŭ ��� 
			
			
		[����] 4, 3, 6, 6, 5 �� ���Դٰ� ����������,
			
			4 4 4 4 
			3 3 3 
			6 6 6 6 6 6 
			6 6 6 6 6 6 
			5 5 5 5 5 
	 */
		
		Random ran = new Random();
		
		
		
		for(int i = 0; i < 5; i++)
		{
			int r = ran.nextInt(6)+1;
			System.out.print(r + " ");
			
			for(int j = 0; j < r -1 ; j++)
			{
				System.out.print(r + " ");
				
			}
			
			System.out.println();
		}
		
	
		

	}

}
