package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class īī���ý�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * [īī�� �ý�]
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 * 5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
		 */
		
		
		Scanner scan = new Scanner(System.in);	
		Random ran = new Random();
	
		int �ӵ� = 0;
		int ���� = 0;
		int ��� = 0;
		
		int x = 0;
		int y = 0;
		
		int x1 = ran.nextInt(21)-10;
		int y1 = ran.nextInt(21)-10;
		
		while(true)
		{
			System.out.println("������ = " + x1 + " " + y1);
			System.out.println("������ġ = " + x + " " + y);
			System.out.println("�ӵ� = " + �ӵ� + " ���� = " + ����);
			
			
			System.out.println("1)�ӵ����� 2)���⼳�� 3)�̵��ϱ� 4)����");
			int sel = scan.nextInt();
			
			if(sel == 0)
			{
				break;
			}
			
			else if(sel == 1)
			{
				System.out.println("�ӵ� �Է� : ");
				�ӵ� = scan.nextInt();
				
				��� += �ӵ�;
				
				if(�ӵ� > 3 || �ӵ� < 1)
				{
					�ӵ� = 1;
				}
			}
			
			else if(sel == 2)
			{
				System.out.println("���⼳�� : ��(1)��(2)��(3)��(4) ");
				���� = scan.nextInt();	
			}
			
			
			else if(sel == 3)
			{
				if(���� == 1)
				{
					x += �ӵ�;
				}
				
				if(���� == 2)
				{
					x -= �ӵ�;
				}
				
				if(���� == 3)
				{
					y -= �ӵ�;
				}
				
				if(���� == 4)
				{
					y += �ӵ�;
				}
			}
			
			else
			{
				System.out.println("�߸��Է�");
			}
			
			if(x == x1 && y == y1)
			{
				System.out.println("������ ����");
				System.out.println("��� = " + ���);
				break;
			}
			
			
			
			
		}
	

	}

}
