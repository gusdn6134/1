package �迭2;

public class �迭2_������Ʈ_�迭�ý� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[�׽�Ʈ]	
		���� �ýô� 5 , 5 ��ġ�� �ִ�.
		dir �迭�� ������ ���ϰ� 0, 1, 2 ,3 �� �� , �� , �� , ���� ���Ѵ�. 	
		speed �迭�� �ӵ��� ���Ѵ�.	
		dir �� speed �迭�� �ýð� �Ź��̵��� ������ ����Ѱ��̴�. 	
		��) ó���� dir �� 0 �̴� ������ ���Ѵ�. 
		   speed �� 4 �̹Ƿ�, y�� 4������  x : 5 , y : 9 ���ȴ�.  	   
		   �ι�°�� dir �� 2 �̴� ���� ���ϰ�, speed �� 2 �̹Ƿ� 
		   y �� 2������  x : 5 , y : 7 �̵ȴ�.    
		   6�� ��� �̵����� �ý��� ��ġ�� ����Ͻÿ�. 	
	*/
		
		
		int speed[] = {4,2,1,5,4,2}; // �ӵ�
		int   dir[] = {0,1,3,2,2,1}; // ���� 0 �� 1 �� 2 �� 3 ��
		int x = 5;
		int y = 5;
		
		
		
		for(int i = 0; i < dir.length; i++)
		{
			
			if(dir[i] == 0)
			{
				y += speed[i];
			}
			
			if(dir[i] == 1)
			{
				x += speed[i];
			}
			
			if(dir[i] == 2)
			{
				y -= speed[i];
			}
			
			if(dir[i] == 3)
			{
				x -= speed[i];
			}
				
		}
		
		System.out.println(x + " " + y);
		
		

	}

}
