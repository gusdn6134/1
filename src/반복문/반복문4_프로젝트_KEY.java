package �ݺ���;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_KEY {

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
		
		int result = 99;
		boolean check = false;
		int i = 1;
		int num = 0;
		
		while(true)
		{
			System.out.print("�Է� : ");
			int key = scan.nextInt();
			
			if(key == -1)
			{
				break;
			}
			
			if(key == result && check == false)
			{
				check = true;
				num = i;
			}
			
			i ++;
		}
		
		if(check == false)
		{
			System.out.println("not found");
		}
		
		else
		{
			System.out.println(num);
		}
		
		
	}

}
