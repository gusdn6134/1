package �����ݺ�4;

public class �������ݺ���_������Ʈ_����ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [����ã��]
		 
		  	 ���帹�� ����ִ� ���ڰ�����
			 ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.	
			 100 : 1��
			 3   : 5�� 	
			 �� : 6		
		 */
		
		
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		
	
	
		int max = 0;
		int maxIndex = 0;
		int min = arr.length;
		int minIndex = 0;

		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;	
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
				}
			}
			
			if(count > max)
			{
				max = count;
				maxIndex = i;
			}
			
			if(count < min)
			{
				min = count;
				minIndex = i;
			}
		}
		
		int total = max + min;
		
		System.out.println(arr[maxIndex] + ": " + max + "��");
		System.out.println(arr[minIndex] + ": " + min + "��");
		System.out.println("�� : " + total + "��");
		
		
	}

}
