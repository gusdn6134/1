package �迭3;

import java.util.Random;

public class �迭3_�˰���_1��7������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		 * [��] 1,7,7,1,1,7,7			
		 *  
		 */
				
		// 7 �� ������ 1�� ������ �����ؼ� �غ��� 7-3�� 1-4��
		Random ran = new Random();
		
		int a [] = new int[7];					
				
		int c7 = 0;
		int c1 = 0;
		int i = 0;
				
		while(true)
			{
				int r = ran.nextInt(2);
				
				if(r == 0)
				{
					if(c7 < 3)
					{
						a[i] = 7;
						c7 ++;
						i++;
					}	
				}
					
				if(r == 1 )
				{
					if(c1 < 4)
					{
						a[i] = 1;
						c1 ++;
						i++;
					}
						
				}
					
				if(c7 == 3 && c1 == 4)
				{
					break;
				}
				
			}
		
				
			for( i = 0; i < a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
				
			System.out.println();
			System.out.println("7 = " + c7 + " 1 = " + c1);
				
	}
}

