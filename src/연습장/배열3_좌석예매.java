package ������;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�¼����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * # ��ȭ�� �¼�����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * �ѱݾ� : 24000��
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		
		int ticket = 0;
		int fee = 12000;
		
		while(true)
		{
			System.out.println(Arrays.toString(seat));
			
			System.out.print("�¼����� : ");
			int sel = scan.nextInt();
			
			if(sel == -1)
			{
				break;
			}
			
			else if(sel >= 0 && sel < 7)
			{
				if(seat[sel] == 0)
				{
					seat[sel] = 1;
					ticket ++;
				}
				
				else {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
				}
			}	
			
			else
			{
				System.out.println("�¼���ȣ�� Ȯ�����ּ���.");
			}
		}
		
		System.out.println("�ѱݾ� = " + ticket * fee);
		

	}

}
