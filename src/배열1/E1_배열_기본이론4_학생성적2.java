package �迭1;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����2 {

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
	
		System.out.println("�ε��� �Է� : ");
		int index = scan.nextInt();
		
		System.out.println(array[index]);
		
		System.out.println();
		
		
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		
		int room = 0;
		
		for(int i = 0; i < 5; i++)
		{
			if(score == array[i])
			{
				room = i;
			}
		}
		
		System.out.println(room);

	}

}
