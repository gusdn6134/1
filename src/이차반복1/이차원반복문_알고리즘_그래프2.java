package �����ݺ�1;

public class �������ݺ���_�˰���_�׷���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		�� �����ʹ� �л� 6���� �����̴�.	
		�� �����͸� �׷����� ǥ���غ������Ѵ�.		
		 ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.		
		��)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
	*/
		
		int scoreList[] = {31, 76, 54, 2, 100, 23};
	
		for(int i = 0; i < scoreList.length; i++)
		{
			int a = scoreList[i] / 10;
			System.out.print(scoreList[i] + " ==> ");
			
			for(int j = 0; j < a; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
	
		

	}

}
