package �迭1;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
	 */
		Random ran = new Random();

		int[] array = new int[5];	
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < 5; i++)
		{
			array[i] = ran.nextInt(100)+1;
			
			System.out.print(array[i] + " ");
			
			if(array[i] >= 60)
			{
				count ++;
			}
			
			total += array[i];		
		}
		
		int avg = total / 5;
		
		System.out.println();
		System.out.println("���� = " + total + " ��� = " + avg);
		System.out.println("�հݻ� �� = " + count);

	}

}
