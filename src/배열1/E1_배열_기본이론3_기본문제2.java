package �迭1;

public class E1_�迭_�⺻�̷�3_�⺻����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 	array = {10,20,30,40,50};
		 * 
			[����1] 4�� ����� ����Ѵ�.
			[��] 20 40
			
			[����2] 4�� ����� ���� ����Ѵ�.
			[��] 60
			
			[����3] 4�� ����� ������ ����Ѵ�.
			[��] 2
		 */
		
		
		int array[] = {10,20,30,40,50};
		
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < 5; i++)
		{
			
			if(array[i] % 4 == 0)
			{
				System.out.print(array[i] + " ");
				total += array[i];
				count ++;
			}
		}
		
		System.out.println();
		System.out.println(total);
		System.out.println(count);
		
	}

}
