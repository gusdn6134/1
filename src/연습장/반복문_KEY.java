package ������;

import java.util.Scanner;

public class �ݺ���_KEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * [Ű��ġ ã��]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
		 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
		 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
		 * 
		 * ��) 
		 * result �� �Է� : 99
		 * 
		 * �Է� : 10
		 * �Է� : 99
		 * �Է� : 20
		 * �Է� : 99
		 * �Է� : 30
		 * �Է� : 99
		 * �Է� : 10
		 * �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		boolean check = false;
		int num = 0;
		int i = 1;
		
		while(true)
		{
			System.out.print("�Է� : ");
			int result = scan.nextInt();
			
			if(result == -1)
			{
				System.out.println("����");
				break;
			}
			
			else if(result == 99 && check == false)
			{
				check = true;
				num = i;
			}
			
			i ++;
		}
		
		if(check == false)
		{
			System.out.println("not founde");
		}
		
		else
		{
			System.out.println(num);
		}
		
	}

}
