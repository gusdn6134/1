package �����ݺ�1;

public class �������ݺ���_�˰���_�׷��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[����] 
			�迭�� ���� �׷����� ����Ϸ����Ѵ�.
			graph �迭�� ������ ����ŭ * ���ݺ������� ���η� ����ϰ�,
			�������ڴ� �����ٲ㼭 ����Ͻÿ�.
		[��]
			 3   ==> ***
			 10  ==> **********
			 5   ==> *****
			 6   ==> ******
			 0   ==> 
			 1   ==> *	
	*/
		
		int[] graph = {3, 10, 5, 6, 0, 1};
		
		int count = 0;

		for(int i = 0; i < graph.length; i++)
		{
				
			count = graph[i];
		
			System.out.print(graph[i] + " ==> " );
			
			for(int j = 0; j < count; j++)
			{
				
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		

	}

}
