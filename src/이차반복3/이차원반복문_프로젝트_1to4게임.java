package �����ݺ�3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �������ݺ���_������Ʈ_1to4���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * [����]
		 * 
		 * [1to4 ����]
		 * 
		 * [1] arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
		 * [2] ����ڴ� ����������1���� ������� �ش� ���ȣ(�ε���)�� �Է��Ѵ�.
		 * [3] ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
		 * 
		 * [��]
		 * 
		 * ���� : { 4 2 3 1 }
		 * 
		 * �ε��� �Է� : 3  ==> { 4 2 3 9 } ==> 1�� �����������̹Ƿ� 9�� �����Ѵ�.
		 * 
		 * �ε��� �Է� : 0 ==>  { 4 2 3 9 }  ==> 4�� �������������ƴϹǷ� ��ȭ������.
	     *
	     * 
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		
		
		for(int i = 0; i < 4;) {
			int r = ran.nextInt(4);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r + 1;
				i += 1;
			}
		}		
		
		int count = 0;
		
		while(true)
		{
			System.out.println(Arrays.toString(arr));
			
			
			if(count == arr.length)
			{
				break;
			}
			
			System.out.println("���� ���� �� �ε��� �Է� : ");
			int index = scan.nextInt();
			int min = 5;
			

			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			
			if(min == arr[index])
			{
				arr[index] = 9;
				count ++;
			}
			
			
			
		}
	}

}
