package �����ݺ�4;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���_������Ʈ_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		
		/*
  		arr1�� ����(1~10)�� 5�� �����Ѵ�.
  		arr2�� ����(1~10)�� 5�� �����Ѵ�. 
  		
  		�� �迭�� ���ؼ� ���� ��ġ�°��� temp1 �������Ѵ�. 
  		
		temp2�� temp1 ���� �ߺ������ʴ¼��ڸ� �����Ѵ�. 
 */
		
		int arr1[] = new int[5];
		int arr2[] = new int[5];		
		int temp1[] =new int[25];		
		int temp2[] = new int[25];
		
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = ran.nextInt(10)+1;
			arr2[i] = ran.nextInt(10)+1;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		int index = 0;
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					temp1[index] = arr1[i];
					index ++;
				}
			}
		}
		
		System.out.println(Arrays.toString(temp1));
		
		
		int index2 = 0;
		
		for(int i = 0; i < temp1.length; i++)
		{
			boolean check = false;
			
			for(int j = 0; j < temp1.length; j++)
			{
				if(temp1[i] == temp2[j])
				{
					check = true;
				}
			}
			
			if(check == false)
			{
				temp2[index2] = temp1[i];
				index2++;
			}
		}
		
		System.out.println(Arrays.toString(temp2));
		
		
	}

}
