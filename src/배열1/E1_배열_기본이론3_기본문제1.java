package �迭1;

public class E1_�迭_�⺻�̷�3_�⺻����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [����1] 10���� 50���� array �迭�� ������ �迭���� ��簪�� ����Ѵ�.
		 [��] 10 20 30 40 50
	
		 [����2] array �迭���� ��簪�� ���� ����Ѵ�.
		 [��] 150
	 */
		
		
		int array [] = new int [5];
		int num = 10;
		int total = 0;
		
		for(int i = 0; i < 5; i++)
		{
			array[i] = num;
			
			num += 10;
			
			System.out.println(array[i]);
			
			total += array[i];
		}
		
		
		System.out.println("�� = " + total);
		
		
		
	}

}
