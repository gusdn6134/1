package �����迭1;

import java.util.Arrays;
import java.util.Scanner;

public class �������迭_�˰���_2�����迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		// ����1) �ε��� 2���� �Է¹޾� �� ���
		// ��1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		
		// ����2) ���� �Է¹޾� �ε��� 2�� ���
		// ��2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		
		// ����3) ���� ū ���� �ε��� 2�� ���
		// ����3) 2 2
		
		// ����4) �� 2���� �Է¹޾� �� ��ü
		
		
		//����1
			System.out.println("==============");
			System.out.println("�ε���1 �Է� : ");
			int index1 = scan.nextInt(); 
			System.out.println("�ε���2 �Է� : ");
			int index2 = scan.nextInt(); 
			System.out.println(arr[index1][index2]);
		
		
		//����2
			System.out.println("==============");
			System.out.print("�� �Է� : ");
			int num = scan.nextInt();
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] == num)
					{
						System.out.println("�ε���1 : " + i + " �ε���2 : " + j);
					}
				}
			}
			
		//����3
			System.out.println("==============");
			int max = 0;
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] > max)
					{
						max = arr[i][j];
						index1 = i;
						index2 = j;
					}
				}
			}
			
			System.out.println(index1 + " " + index2);
			
		//����4
			System.out.println("==============");
			System.out.print("��1 �Է� : ");
			int num1 = scan.nextInt();
			System.out.print("��2 �Է� : ");
			int num2 = scan.nextInt();
			
			int temp = 0;
			
			if(num1 > num2) 
			{
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			for(int i = 0; i < arr.length; i++) 
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					if(arr[i][j] == num1 ) 
					{
						temp = arr[i][j];
						index1 = i;
						index2 = j;
					}
					
					if(arr[i][j] == num2) 
					{
						arr[index1][index2] = arr[i][j];
						arr[i][j] = temp;
					}
				}
			}
			
			for(int i = 0; i < arr.length; i++) 
			{
				System.out.println(Arrays.toString(arr[i]));
			}
			
			
			
			
	}

}
