package �����ݺ�4;

public class �������ݺ���_������Ʈ_���ϰ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	 	item �迭�� ������ ��ȣ�̴�.
	 	price �� �� �����ۺ� ���������̴�.
	 	
	 	order �� ������ �ֹ�����Ʈ�̴�. 
	 	count �� �ֹ�����Ʈ�� �����̴�. 
	 	���� ������ ���ΰ�?
 	 */
	
		
		int item[] = {1001,1002,1003,1004,1005};
		int price[] = {500,100,1200,4300,4000};
		
		int order[] = {1003,1002,1001,1001,1005};
		int count[] = {1   ,3   ,2   ,5   ,1};
		
		
		
		int index = 0;		
		int total = 0;
		
		for(int i = 0; i < item.length; i++)
		{
			for(int j = 0; j < order.length; j++)
			{
				if(item[i] == order[j])
				{
					index = j;
					
					total +=  price[i] * count[index]; 
				}
					
				
			}
		}

		System.out.println(total);
	}

}
