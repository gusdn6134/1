package ������;

import java.util.Arrays;
import java.util.Random;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		// �ߺ����ڱ��� ==> 1~4�� �迭�� �����ϴµ� ��� �ߺ����� �����Ѵ�. 
		// �ߺ����� �ذ��� 3���� 
		// 
		// [3] ��ü �˻�
		
		
		int arr1[] = new int[4]; // ���� 0 ���� 
	
		for(int i = 0; i < arr1.length;)
		{
			
			int r = ran.nextInt(4)+1;
			boolean check = false;
			
			for(int j = 0; j < i; j++)
			{
				if(arr1[j] == r)
				{
					check = true;
					break;
				}
				
			}
			
			if(check == false)
			{
				arr1[i] = r;
				i++;
				
			}			
			
		}
		
		
		System.out.println(Arrays.toString(arr1));
	}

}
