package �����ݺ�1;

public class �������ݺ���_�˰���_�迭��02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		�Ʒ� ��ȣ�� ������ �̹��б� �߰���� �л���ȣ�� �����̴�. 
		
		�Ʒ� �˻��迭�� �б�Ȩ�������� ���� �˻��� �л���ȣ�̴�.
		�˻��� ������� ��ȣ�� ������ ����Ͻÿ�.
		
		[����]
			1001 ==> 30
			1003 ==> 45
			1003 ==> 45
			1002 ==> 54
	 */
		
		int[] ��ȣ = {1001,1002,1003,1004,1005};
		int[] ���� = {30, 54, 45, 100, 20};
	
		int �˻�[] = {1001, 1003, 1003, 1002};
		
		
		
		int index = 0;
		int a = 0;
		
		
		for(int i = 0; i < �˻�.length; i++)
		{
			System.out.print(�˻�[i] + " ==> ");
			
			for(int j = 0; j < ��ȣ.length; j++)
			{
				if(�˻�[i] == ��ȣ[j])
				{
					index = j;
					
					System.out.print(����[index] + " ");
					System.out.println();
				}
			}
		}

	}

}
