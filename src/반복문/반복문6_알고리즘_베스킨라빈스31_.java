package �ݺ���;

import java.util.Scanner;

public class �ݺ���6_�˰���_����Ų���31_ {

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
		
		
		int total = 0;
		int turn = 0;

		while(true)
		{
			
			if(turn % 2 == 0)
			{		
				System.out.println("p1/ 1 ~ 3 ���� �Է�");
				int num = scan.nextInt();
					
			 if(num <= 3 && num >= 1)
				{
					total += num;
					turn ++;
					System.out.println(total);
					if(total >= 31)
					{
						System.out.println("p1 �¸�");
						break;
					}
				}
			 
				if(num > 3 || num < 1)
				{
					System.out.println("�ٽ��Է�");
					System.out.println(turn);
					System.out.println(total);
				}
			
			}
			
			
			else if(turn % 2 == 1)
			{
				
				System.out.println("p2 / 1 ~ 3 ���� �Է�");
				int num = scan.nextInt();
					
				if(num <= 3 && num >= 1)
				{
					total += num;
					turn --;
					System.out.println(total);
					
					if(total >= 31)
					{
						System.out.println("p2 �¸�");
						break;
					}
				}
				
				if(num > 3 || num < 1)
				{
					System.out.println("�ٽ��Է�");
					System.out.println(turn);
					System.out.println(total);
				}
	
			}
				
		}
	
	}

}
