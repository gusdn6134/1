package ������;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���_īī���ý� {

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
		
		int x = ran.nextInt(21)-10;
		int y = ran.nextInt(21)-10;
		
		int x2 = 0;
		int y2 = 0;
		
		int �ӵ� = 0;
		int ���� = 0;
		int ��� = 0;
		
		while(true)
		{
			
			System.out.println("������ x = " + x + " ������ y = " + y);
			System.out.println("������ġ x = " + x2 + " ������ġ y = " + y2);
			System.out.println("�ӵ� = " + �ӵ� + " ���� = " + ����);
			
			System.out.println("1)�ӵ� ���� 2)���� ���� 3)�̵��ϱ� 0)����");
			int sel = scan.nextInt();
			
			if(sel == 0)
			{
				System.out.println("����");
				break;
			}
			
			else if(sel == 1)
			{
				System.out.print("�ӵ� 1 ~ 3 �Է� : ");
				�ӵ� = scan.nextInt();
				��� += �ӵ�;
				
				if(�ӵ� < 1 && �ӵ� > 3)
				{
					�ӵ� = 1;
				}
			}
		
			else if(sel == 2)
			{
				System.out.print("���� ����  ��(1)��(2)��(3)��(4) : ");
				���� = scan.nextInt();
				
				if(���� < 1 && ���� > 3)
				{
					���� = 1;
				}	
			}
			
			else if(sel == 3)
			{
				if(���� == 1)
				{
					x2 += �ӵ�;
				}
				
				if(���� == 2)
				{
					x2 -= �ӵ�;
				}
				
				if(���� == 3)
				{
					y2 -= �ӵ�;
				}
				
				if(���� == 4)
				{
					y2 += �ӵ�;
				}
			}
			
			if(x == x2 && y == y2)
			{
				System.out.println("������ ����");
				System.out.println("��� = " + ��� * 50 + "��");
				x = ran.nextInt(21)-10;
				y = ran.nextInt(21)-10;
			}
			
		}
		
		

	}

}
