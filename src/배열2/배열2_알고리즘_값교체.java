package �迭2;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_����ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };	
		System.out.println("�ε���1 �Է� : ");
		int index1 = scan.nextInt();
		
		System.out.println("�ε���2 �Է� : ");
		int index2 = scan.nextInt();
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		System.out.println(Arrays.toString(arr));
			
		System.out.println();
		
		
		System.out.println("��1 �Է� : ");
		int num1 = scan.nextInt();
		
		System.out.println("��2 �Է� : ");
		int num2 = scan.nextInt();
		
		temp = -1;
		int temp2 = -1;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(num1 == arr[i])
			{
				temp = i;
			}
			
			if(num2 == arr[i])
			{
				temp2 = i;
			}
		}
		
		if(temp != -1 && temp2 != -1)
		{
			int index3 = arr[temp];
			arr[temp] = arr[temp2];
			arr[temp2] = index3;
		}
		
		else
		{
			System.out.println("�� ����");
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
