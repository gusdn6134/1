package �����ݺ�1;

import java.util.Arrays;

public class �������ݺ���_�˰���_�迭��01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  [����] array �迭 ���� �����߿��� b�迭�� ���� ������ 
			     b�� array�� ���� ��ġ�°���  0���� ����	
			 
			 [��] 
			 	array[] = {0,0,30,40};
				   b[] = {0,3,0,50};	
			
		 */
		
		int array[] = {10,20,30,40};
		int b[] = {10,3,20,50};
		
		
		
		for(int i = 0; i < array.length; i++)
		{
			
			for(int j = 0; j < array.length; j++)
			{
				if(array[i] == b[j])
				{
					array[i] = 0;
					b[j] = 0;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b));

	}

}
