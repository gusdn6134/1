package �����ݺ�3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �������ݺ���_������Ʈ_ƽ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * [ƽ����]
		 *  
		 * 	����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
		 * 	          �Ʒ��Ͱ��� ������.
		 *  ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
		 *  ����3) ���� ������ �ϼ��ϸ� �¸�
		 *  [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
		 *
		 *=============
		 * [ó��ȭ��]
		 * 0,0,0
		 * 0,0,0
		 * 0,0,0
		 * [p1]�ε��� �Է� : 6
		 * =============
		 * [1��]
		 * 0,0,0
		 * 0,0,0
		 * 1,0,0
		 * [p2]�ε��� �Է� : 1
		 * =============
		 * [2��]
		 * 0,2,0
		 * 0,0,0
		 * 1,0,0
		 * [p1]�ε��� �Է� : 3
		 * =============
		 * [3��]
		 * 0,2,0
		 * 1,0,0
		 * 1,0,0
		 * [p2]�ε��� �Է� : 2
		 * =============
		 * [4��]
		 * 0,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1]�ε��� �Է� : 0
		 * =============
		 * [5��]
		 * 1,2,2
		 * 1,0,0
		 * 1,0,0
		 * [p1] �¸�
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] tic = new int[9];
		
		int p = 0;
		int turn = 1;
		int p1count = 0;
		int p2count = 0;
		int index = 0;
		int r2 = 0;
		
		
		while(true)
		{
			
			System.out.println("[" + turn + "��]");
			
			for(int i = 0; i < tic.length; i++)
			{
				System.out.print(tic[i] + " ");
				
				if(i % 3 == 2)
				{
					System.out.println();
				}
			}
			
			boolean check = false;
			
			if(turn % 2 != 0)
			{
				System.out.print("p1�ε��� �Է� : ");
				index = scan.nextInt();
				
					if(tic[index] == 1 || tic[index] == 2)
					{
						check = true;
						System.out.println("�ߺ�");
					}
					
					if(check == false)
					{
						tic[index] = 1;
						turn ++;
					}
					
			}

			
			
			else if(turn % 2 == 0)
			{
				int r = ran.nextInt(9);
				System.out.println("p2�ε��� = " + r);
				
				r2 = r;
				
				if(tic[r] == 2 || tic[r] == 1)
				{
					check = true;
					System.out.println("�ߺ�");
				}
				
				if(check == false)
				{
					tic[r] = 2;
					turn --;
					p2count ++;
				}
			}
			
			
		

	
	}
		

	}

}
