package �����ݺ�3;

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
		
		int minCount = arr.length;
		int maxCount = 0;
		int maxIndex = -1;
		int minIndex = -1; 
		
		
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
			
			if(count > maxCount)
			{
				maxCount = count;
				maxIndex = i;
			}
			
			if(count < minCount)
			{
				minCount = count;
				minIndex = i;
			}
		}
		
		System.out.println(arr[maxIndex] + ": " + maxCount + "��");
		System.out.println(arr[minIndex] + ": " + minCount + "��");
		int total = maxCount + minCount;
		System.out.println("��" + total);
	}

}
