package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * [īī�� �ý�]
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 * 5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int ��ġx = 0;
		int ��ġy = 0;
		int ��� = 0;
		
		 int x = ran.nextInt(21)-10;
		 int y = ran.nextInt(21)-10;
		 
		while(true)
		{
			 System.out.println("������ = " + x + " " + y);	 
			
			 
			 System.out.println("1) ���� ���� [1]�� [2]�� [3]�� [4]��");
			 int ���� = scan.nextInt();
	
			 System.out.println("2) �ӵ� ����");
			 int �ӵ� = scan.nextInt();
			 
			 if(�ӵ� <= 3 && �ӵ� >= 1)
			 {
				 ��� += �ӵ�;
				 
				 if(���� == 1)
				 {
					 ��ġx += �ӵ�;
				 }
				 
				 else if(���� == 2)
				 {
					 ��ġx -= �ӵ�;
				 }
				 
				 else if(���� == 3)
				 {
					 ��ġy -= �ӵ�;
				 }
				 
				 else if(���� == 4)
				 {
					 ��ġy += �ӵ�;
				 }
				 
				 else
				 {
					 System.out.println("�߸��Է�");
				 }
				 
				 System.out.println("���� ��ġx = " + ��ġx + " ���� ��ġy = " + ��ġy);
					
			 }
			 
			 else
			 {
				 System.out.println("�ӵ� �߸� �Է�");
			 }
			 
			 
			 if(x == ��ġx && y == ��ġy)
			 {
				 System.out.println("����");
				 System.out.println("��� = " + ��� * 50);
				 break;
 
			 }	
					 
			
			
		}
		

	}

}
