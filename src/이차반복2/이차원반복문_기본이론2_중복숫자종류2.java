package �����ݺ�2;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���_�⺻�̷�2_�ߺ���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ߺ����ڱ��� ==> 1~4�� �迭�� �����ϴµ� ��� �ߺ����� �����Ѵ�. 
				// �ߺ����� �ذ��� 3���� 
				// 
				// [2] check �迭Ȱ�� 		
				Random ran = new Random();
				
				int arr1[] = new int[4]; // ���� 0 ���� 
				boolean check[] = new boolean[4];
				
				for(int i = 0; i < 4;) {
					int r = ran.nextInt(4);
					if(check[r] == false) {
						check[r] = true;
						arr1[i] = r;
						i += 1;
					}
				}		
				System.out.println(Arrays.toString(arr1));
				for(int i = 0; i < 4; i++) {
					arr1[i] += 1;
				}
				System.out.println(Arrays.toString(arr1));	
				
	}

}
