package �����迭1;

import java.util.Arrays;

public class �������迭_�˰���_2�����迭3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr =
			{
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// ���� 1) ���� �� ���
		// ���� 1) 410, 810, 1210
			
		// ���� 2) ���� �� ���
		// ���� 2) 603, 606, 609, 612
			
			int index = 0;
			int index2 = 0;
			
			
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 0; j < arr[i].length; j++)
				{
					garo[index] += arr[i][j];
					sero[index2] += arr[i][j];
					index2 ++;
				}
				
				index ++;
				index2 = 0;
				
			}
			
			System.out.println(Arrays.toString(garo));
			System.out.println(Arrays.toString(sero));
	}

}
