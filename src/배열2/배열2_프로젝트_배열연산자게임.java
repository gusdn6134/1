package �迭2;

import java.util.Arrays;

public class �迭2_������Ʈ_�迭�����ڰ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[�׽�Ʈ]
		[������ ����]
			a �� b �׸��� op�� ������ �� ���Ѵ�. 
			a �� b �� �������� ������ total �� �����ϸ�ȴ�.
			��, �����ڴ� �����̹Ƿ� ���ڷ� ǥ���Ѵ�. 
		-----------------------------
			[������ �� �ǹ�]
			0 => ���ϱ�
			1 => ����
			2 => ���ϱ�
		
		
		[����]
			a = 3
			b = 8
			op = 0 // 0�� ���ϱ��̹Ƿ� 
			total = {11,0,0,0,0,0};
			
		[����]
			a = 5
			b = 6
			op = 1 // 1�� �����̹Ƿ�
			total = {11,-1,0,0,0,0}
		
	*/
		
		int a[] = {3,5,7,6,4,9};
		int b[] = {8,6,8,5,5,3};		
		int op[] = {0,1,0,2,2,0};	
		int total [] = new int[6];
		
		
		for(int i = 0; i < a.length; i++)
		{
			if(op[i] == 0)
			{
				total[i] = a[i] + b[i];
			}
			
			if(op[i] == 1)
			{
				total[i] = a[i] - b[i];
			}
			
			if(op[i] == 2)
			{
				total[i] = a[i] * b[i];
			}
		}
		
		System.out.println(Arrays.toString(total));

	}

}
