package �迭3;

import java.util.Arrays;

public class �迭3_�˰���_�Ųٷ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a = { 1,2,3,4,5 };
		 * 
		 * [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
		 * [��]   b = {5,4,3,2,1};
		 */
		
		
		int a[] = { 1,2,3,4,5 };
		int b[] = { 0,0,0,0,0 };
		
		
		int index = 4;
		
		for(int i = 0; i < b.length; i++)
		{
			
			b[i] = a[index];
			index --;
		}
		
		System.out.println(Arrays.toString(b));

	}

}
