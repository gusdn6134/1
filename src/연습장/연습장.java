package ������;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		/*
		  [ȸ������] ���������� ����
		  1. �߰� = > ID�� �ִ��� Ȯ���ϰ� ������ ȸ������
		  2. ����(��) => ���� ����ִ� �ε��� ã�� �����ϰ� �� �� �� ������ ���
		
	 	 */
		
		int[] arr = {0, 0, 0, 0, 0};
		int index = 0;
		
		
		while(true)
		{
			
			System.out.println(Arrays.toString(arr));
			System.out.println("1) �߰� 2)���� 0) ����");
			int sel = scan.nextInt();
			
			if(sel == 0)
			{
				break;
			}
			
			else if(sel == 1)
			{
				if(index < arr.length)
				{
					System.out.print("�߰��� ���̵� �Է� : ");
					int id = scan.nextInt();
					
					boolean check = false;
					
					for(int i = 0; i < arr.length; i++)
					{
						if(arr[i] == id)
						{
							check = true;
							break;
						}
					}
					
					if(check == false)
					{
						arr[index] = id;
						index ++;
						System.out.println(id + "�� ȸ������ �Ϸ�");
					}
					
					else
					{
						System.out.println("�ߺ�");
					}
				}
				
				else
				{
					System.out.println("ȸ������ �Ұ�");
				}
			}
			
			else if(sel == 2)
			{
				System.out.print("������ id �Է� : ");
				int id = scan.nextInt();
				
				int room = -1;
				
				for(int i = 0; i < arr.length; i++)
				{
					if(id == arr[i])
					{
						room = i;
					}
				}
				
				if(room != -1)
				{
					for(int i = 0; i < index - 1; i++)
					{
						if(i >= room)
						{
							arr[i] = arr[i + 1]; 
						}
					}
					
					arr[index - 1] = 0;
					index --;
					System.out.println("�����Ϸ�");
				}
				
				else
				{
					System.out.println("���� �Ұ�");
				}
			}
		}

	}
}

