package ������;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �����ݺ�3_���°��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		  �迭3_������Ʈ_���°���(���� o)
		  [���� ����]
		  
		  1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
		  2. front �� ī�带 ����� ���¸� ���Ѵ�. 
		  3. ���� front �� �����Ѵ�. 
		  4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
		  5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
		     back�� ��� ���� �� ä������ ������ ����ȴ�.
		     
		  6. ���� �ε��� �����Ҽ�����. 
		  7. �̹� ������ �ڸ��� �� �����Ҽ�����. 
		    
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int front[] = {10,10,20,20,30,30,40,40,50,50};
		int back[] = new int[10];
		
		for(int i = 0; i < front.length; i++)
		{
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			
			
			int temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
			
		}
		
		
		System.out.println(Arrays.toString(front));
		
		boolean check[] = new boolean [10];
		
		int count = 0;
		
		
		while(true)
		{
			
			System.out.println(Arrays.toString(back));
			
			System.out.print("ī��1 ����");
			int num1 = scan.nextInt();
			System.out.print("ī��2 ����");
			int num2 = scan.nextInt();
			
			
			if(check[num1] == false && check[num2] == false)
			{
				if(front[num1] == front[num2])
				{
					check[num1] = true;
					check[num2] = true;
					
					back[num1] = front[num1];
					back[num2] = front[num1];
					
					count ++;
				
				}
				
				if(front[num1] != front[num2])
				{
					System.out.println("ī�尡 �ٸ�");
				}
			}
			
			else
			{
				System.out.println("�ߺ�");
			}
		}
		
		
	}

}
