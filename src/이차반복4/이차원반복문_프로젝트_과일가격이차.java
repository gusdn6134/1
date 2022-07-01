package 이차반복4;

public class 이차원반복문_프로젝트_과일가격이차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	 	item 배열은 아이템 번호이다.
	 	price 는 각 아이템별 개별가격이다.
	 	
	 	order 는 오늘의 주문리스트이다. 
	 	count 는 주문리스트의 개수이다. 
	 	오늘 매출은 얼마인가?
 	 */
	
		
		int item[] = {1001,1002,1003,1004,1005};
		int price[] = {500,100,1200,4300,4000};
		
		int order[] = {1003,1002,1001,1001,1005};
		int count[] = {1   ,3   ,2   ,5   ,1};
		
		
		
		int index = 0;		
		int total = 0;
		
		for(int i = 0; i < item.length; i++)
		{
			for(int j = 0; j < order.length; j++)
			{
				if(item[i] == order[j])
				{
					index = j;
					
					total +=  price[i] * count[index]; 
				}
					
				
			}
		}

		System.out.println(total);
	}

}
