package ������;

import java.util.Scanner;

public class �ݺ���_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * [������ ���]
		 * 1. 5�� �ֹ��� �޴´�.
		 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��)
		 * �޴� ���� : 1
		 * �޴� ���� : 1
		 * �޴� ���� : 2
		 * �޴� ���� : 2
		 * �޴� ���� : 3
		 * �� �ݾ� = 31300��
		 * ���� �Է� : 32000
		 * === �Ե����� ������ ===
		 * 1. �Ұ�� ���� : 2��
		 * 2. ����    ���� : 2��
		 * 3. ��         �� : 1��
		 * 4. ��   ��   �� : 31300��
		 * 5. ��         �� : 700��
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1)
			{
				a ++;
			}
			
			if(sel == 2)
			{
				b ++;
			}
			
			if(sel == 3)
			{
				c ++;
			}
		}
		
		int total = price1 * a + price2 * b + price3 * c;
		
		System.out.println("�ѱݾ� = " + total);
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		int change = money - total;
		
		if(money >= total)
		{
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ���� : " + a + "��");
			System.out.println("2. ����  ���� : " + b + "��");
			System.out.println("1. ��     �� : " + c + "��");
			System.out.println("��   ��   �� :" + total + "��");
			System.out.println("��         �� :" + change + "��");
		}
		else
		{
			System.out.println("���� ����");
		}
		
		

	}

}
