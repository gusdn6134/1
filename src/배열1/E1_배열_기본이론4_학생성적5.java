package �迭1;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  
		 *  numberList = {1001, 1002, 1003, 1004, 1005};
		 *	scoreList  = {  87,   11,   45,   98,   23};
		 * 
		 *  [����] �й��� �Է¹޾� ���� ����Ѵ�. 
			 		��, �����й� �Է� �� ����ó�� �Ͻÿ�.
			 ��)
			 �й� �Է� : 1002		���� : 11��
			 �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�. 
		 */	
		Scanner scan = new Scanner(System.in);
		
		 int numberList[] = {1001, 1002, 1003, 1004, 1005};
		 int scoreList[]  = {  87,   11,   45,   98,   23};
		 
	
		 
		 while(true)
		 {
			 
			 int room = -1;
			 System.out.println("�й��Է� : ");
			 int number = scan.nextInt();
			 
			 for(int i = 0; i < 5; i++)
			 	{
				 if(number == numberList[i])
				 {
					 room = i;
					 System.out.println("���� = " + scoreList[room]);
				 }
			 	}
			 
			 
			 if(room == -1)
			 {
				 System.out.println("�ش��й��� �������� �ʽ��ϴ�");
				 break;
			 }

		 }
		
	}

}
