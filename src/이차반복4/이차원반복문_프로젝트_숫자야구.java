package �����ݺ�4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �������ݺ���_������Ʈ_���ھ߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
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
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		
		while(true) {
			System.out.println("------------------------");
			int meindex= 0;
			
			while(true)
			{
				if(meindex == 3) 
				{
					break;
				}
				
				System.out.println("�Է� : ");
				int num = scan.nextInt();

				boolean check = false;
				
				for(int i = 0; i < meindex; i++)
				{
					if(num == me[i])
					{
						check = true;
						break;
					}
				}
				
				if(check == false)
				{
					me[meindex] = num;
					meindex += 1;
					//System.out.println(Arrays.toString(me));
				}
				
				else
				{
					System.out.println("�ߺ� : " + num);
				}
				
			}
			
			System.out.println("------------------------");
			int s = 0;
			int b = 0;
			for(int i = 0; i < 3; i++) 
			{
				for(int j = 0; j < 3; j++) 
				{
					if(me[i] == com[j]) 
					{
						if(i == j)
						{
							s += 1;
						}	
						else
						{
							b += 1;
						}
					}
				}
			}
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			System.out.println("s = " + s + " b =  " + b);
			
			if(s == 3)
			{
				System.out.println("����.");
				break;
			}
		}
			

	}

}
