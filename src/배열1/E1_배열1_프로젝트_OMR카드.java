package �迭1;

import java.util.Arrays;
import java.util.Random;

public class E1_�迭1_������Ʈ_OMRī�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [OMRī��]
		 * 
		 * 1. �迭 test�� ���蹮���� �������̴�.
		 * 2. �迭 student�� 1~5 ������ ���� ���� 5���� �����Ѵ�.	
		 * 3. ���ڸ����� ���ؼ� ������ ����Ѵ�.
		 *     ==> ������ true , Ʋ���� false
		   4. ������ �� ������ 20���̴�.
		   5. ������ ����Ѵ�.  
		   
		 * [��]
		 * test  = {1, 3, 4, 2, 5}
		 * student = {1, 1, 4, 4, 3}
		 * result  = {t, f, t, f, f} 
		*/
		Random ran = new Random();
		
		int test[] = {1, 3, 4, 2, 5};
		int student[] = new int[5];
		boolean result[] = new boolean[5];
		int score = 0;
		
		for(int i = 0; i < student.length; i++)
		{
			student[i] = ran.nextInt(5)+1;
			
			if(student[i] == test[i])
			{
				result[i] = true;
				score += 20;
			}
			
			else
			{
				result[i] = false;
			}
		}
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		System.out.println(score + "��");
	}

}
