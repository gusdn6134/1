package �����ݺ�4;

import java.util.Arrays;
import java.util.Scanner;

public class �������ݺ���_������Ʈ_���ھ߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [���� �߱� ����]
		 * 1. me�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 *    ��) 1,1,1 
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		int index = 0;
		int count = 0;
		
		
		
		while(true)
		{
			
			System.out.println("���� �Է� : ");
			int num = scan.nextInt();
			
			boolean check = false;
			
			for(int i = 0; i <= index; i ++)
			{
				if(me[i] == num)
				{
					check = true;
					
					System.out.println("�ߺ� �ٽ� �Է�");
				}
			}
			
			if(check == false)
			{
				me[index] = num;
				index ++;

			}
		
			
			if(index == me.length) {
				System.out.println(Arrays.toString(me));
				break;
			}
		}
		
		int ball = 0;
		int strike = 0;
		
		
		for(int i = 0; i < com.length; i++)
		{
			for(int j = 0; j < me.length; j++)
			{
				if(com[i] == me[j])
				{
					if(i == j)
					{
						strike ++;
					}
					
					else
					{
						ball ++;
					}
				}
			}
		}
	
		System.out.println("strike : " + strike +" ball : " + ball);
		

	}

}
