package 이차반복1;

public class 이차원반복문_알고리즘_그래프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[문제] 
			배열의 값을 그래프로 출력하려고한다.
			graph 배열의 각각의 값만큼 * 을반복적으로 가로로 출력하고,
			다음숫자는 줄을바꿔서 출력하시오.
		[예]
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
