package �ݺ���;

public class �ݺ���4_�˰���_369�ڼ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 *  [369����]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * 
		 * 3. ������ ���ڿ� 3�̳� 6�̳� 9�� �ΰ� �� "¦¦"
		 * 4. ������ ���ڿ� 3�̳� 6�̳� 9�� �Ѱ� �� "¦"
		 * 5. 3�̳� 6�̳� 9�� ������ �׳� ������� 
		 * 
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		
		int count = 0;
		
		for(int i = 1; i <= 50; i++)
		{
			
			if(i / 10 == 3 || i / 10  == 6 || i / 10 == 9)
			{
				count ++;
			}
			
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
			{
				count ++;
				
			}
			
			
			if(count == 1)
			{
				System.out.println("¦");
			}
			
			else if(count == 2)
			{
				System.out.println("¦¦");	
			}
			
			else
			{
				System.out.println(i);
			}
			
			count = 0;
			
			
		}

	}

}
