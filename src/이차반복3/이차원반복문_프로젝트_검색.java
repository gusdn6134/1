package �����ݺ�3;

public class �������ݺ���_������Ʈ_�˻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 	��ȣ����Ʈ�� ��������Ʈ�� �ѽ��̴�.
	 	�̹��б� �л���ȣ�� �����̴�. 
	 	1001 ���л��� 10���� �������̴�. 		 		 	
	 	��ġ����Ʈ�� �л����� �˻��� ������ �����س������̴�. 	 	
	 	��ġ����Ʈ �� ��ȣ�� �ѹ�����Ʈ���� ã�Ƽ� �ش������� ������ָ�ȴ�. 
	 	���࿡ ��ġ����Ʈ�� ��ȣ�� �ѹ�����Ʈ�� ������ "����" �� ����ϸ�ȴ�. 		 	
	 	[���]
	 		1001 ==> 10
	 		1005 ==> 40
	 		103  ==> "����"
	 		1003 ==> 23
	 		
	 		
	 */
	int scoreList[] = {10, 43, 23, 76 , 40};
	int numberList[] = {1001,1002,1003,1004,1005};		
	int searchList [] = { 1001, 1005, 103 , 1003};
	
	
	int index = 0;
	
	for(int i = 0; i < searchList.length; i++)
	{
		boolean check = false;
		
		for(int j = 0; j < numberList.length; j++)
		{
			if(searchList[i] == numberList[j])
			{
					check = true;
					index = j;
					System.out.println(scoreList[index]);
			}
		}
		if(check == false)
		{
			System.out.println("����");
		}
	}
	
	}

}
