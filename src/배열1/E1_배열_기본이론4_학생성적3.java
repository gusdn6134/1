package �迭1;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
			 scoreList = { 87, 11, 45, 98, 23 };
			 [����] �й��� �Է¹޾� ���� ���
			 [����] �й� �Է� : 1003 ���� : 45��
			 [�߰�����]������ �ѹ��� �Է��ϸ� ������ ��������, 
			 		 ���� ���Ҷ����� Ȯ���ϰ� -1000�� �Է��ϸ�����.
		 */
		Scanner scan = new Scanner(System.in);
		
		int numberList[] = { 1001, 1002, 1003, 1004, 1005 };
		int scoreList[] = { 87, 11, 45, 98, 23 };
		
		int room = 0;
		
		
		while(true)
		{
		
			System.out.print("�й��Է� : ");
			int num = scan.nextInt();
			
			for(int i = 0; i < 5; i++)
			{
			if(num == numberList[i])
			{
				room = i;
				System.out.println(scoreList[room]);
			}
			
			}
			
			if(num == -1000)
			{
				break;
			}
					
		}
		
	
	}

}
