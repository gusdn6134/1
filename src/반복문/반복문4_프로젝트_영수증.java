package �ݺ���;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_������ {

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
			System.out.println("�ֹ� : ");
			int �޴� = scan.nextInt();
	
			
			if(�޴� == 1)
			{
				a ++;
			}
			
			if(�޴� == 2)
			{
				b ++;
			}
			
			if(�޴� == 3)
			{
				c ++;
			}
		}
		
		
		int total = price1 * a + price2 * b + price3 * c;
		
		System.out.println("�ѱݾ� = " + total);
		System.out.println("���� �Է� : " );
		int num = scan.nextInt();
		
		int change = num - total;
		
		if(change >= 0) {
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ���� : " + a + "��");
			System.out.println("2. ����    ���� : " + b + "��");
			System.out.println("3.��         �� : " + c + "��");
			System.out.println("4. ��   ��   �� : " + total + "��");
			System.out.println("5. ��         �� : " + change + "��" );
		//���� �Ž������� < 0�̸� ��� �Ұ���	
		}else {
			System.out.println("������ �����մϴ�");
		}
		

	}

}
