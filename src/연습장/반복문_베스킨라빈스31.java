package ������;

import java.util.Scanner;

public class �ݺ���_����Ų���31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [����Ų���31]
		 *   ����Ų��� �����̶�, �÷��̾� 2���� �����ư��鼭
		 *   1~3������ ���ڸ� �����Ҽ��ְ�, �׼��ڵ��� ��� ���ؼ� 
		 *   �״������� 31�� �������������� ���°����̴�.
		 * 
		 * 
		 * 1) �� �÷��̾�� �����ư��鼭 1~3�� �����Ѵ�.
		 * 2) ���࿡ �̻��Ѽ��ڸ� �Է��ϸ� 1~3�� �Է��Ҷ����� ����ڱ� �����̴�.
		 * 3) �� �÷��̾ �����Ѽ��ڴ�  total  ������ ��� �����ؼ� ���Ѵ�.
		 * 4) total �� 31�̻� �����ϸ� �¸��ڸ� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int turn = 0;
		int total = 0;
		
		
		while(true)
		{
			
			System.out.println("�� = " + total);
			
			if(turn == 0)
			{
				System.out.print("P1 �Է� : ");
				int num = scan.nextInt();
				

				if(num >= 1 && num <= 3)
				{
					total += num;
					turn ++;
				
					if(total >= 31)
					{
						System.out.println("P1 �¸�");
						break;
					}
				}
				
				else
				{
					System.out.println("1 ~ 3 ���� �Է��ϼ���");
				}
			}
			
			else if(turn == 1)
			{
				System.out.print("P2 �Է� : ");
				int num = scan.nextInt();
				
				if(num >= 1 && num <= 3)
				{
					total += num;
					turn --;
					
					
					if(total >= 31)
					{
						System.out.println("P2 �¸�");
						break;
					}
				}
				
				else
				{
					System.out.println("1 ~ 3 ���� �Է��ϼ���");
				}
			}
			
		}

	}

}
