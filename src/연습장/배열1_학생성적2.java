package ������;

import java.util.Scanner;

public class �迭1_�л�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	 array = { 87, 11, 45, 98, 23 };
		  
			 [����1] �ε����� �Է¹޾� ���� ���
			 [����1] �ε��� �Է� : 1 ���� : 11��
		
			 [����2] ������ �Է¹޾� �ε��� ���
			 [����2] ���� �Է� : 11 �ε��� : 1
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int array[] = {87, 11, 45, 98, 23};
		
		System.out.print("�ε��� �Է� : ");
		int index = scan.nextInt();
		
		System.out.println("���� : " + array[index]);
		
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		int room = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(score == array[i])
			{
				room = i;
			}		
		}
		
		System.out.println("�ε��� : " + room);
	
	}

}
