package �����ݺ�3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �������ݺ���_������Ʈ_max���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [max����]
		 * 
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 * �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
		 */
		//[��ȭ] �������� �ε��� ���� ���µ�, ������ ��ȣ�� �ٽ� ������ �ʰ� ����
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
			
		int[] arr = {11, 87, 42, 100, 24};
		
		int count = 0;
		int max = 0;
		
		boolean [] check = new boolean[5];
		
		
		while(true)
		{
			max = 0;
			
			int r = ran.nextInt(5);
			
			if(count == arr.length)
			{
				break;
			}
			
			if(check[r] == false)
			{
				check[r] = true;	
				
				for(int i = 0; i <arr.length; i++)
				{
					if(arr[i] > max)
					{
						max = arr[i];
					}
				}
				
				
				if(arr[r] == max)
				{
					arr[r] = 0;
					System.out.println(Arrays.toString(arr));
					count ++;
					
					for(int j = 0; j < 5; j++) {
						check[j] = false;
						}
				}
			}
			
			
			
		}
		

	}

}
