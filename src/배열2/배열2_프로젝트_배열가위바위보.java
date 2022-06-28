package 배열2;

public class 배열2_프로젝트_배열가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[테스트]
			철수와 민수는 가위바위보를 6회 하였다. 
			가위(0) , 바위(1) , 보(2) 를 뜻한다. 
			아래 배열은 각각 가위바위보를 낸 기록을 저장한것이다. 
			
			철수와 민수는 계단 50번째 부터 게임을 시작하였다. 
			철수와 민수는 게임을 모두 끝마치고 어디있을까?
			[규칙]
				이기면 5칸 올라간다.
				비기면 1칸 올라간다.
				지면 3칸 내려간다. 
	*/
		
		int list1[] = {0,1,2,2,1,0};
		int list2[] = {2,1,1,2,0,1};
		
		int 철수 = 50;
		int 민수 = 50;
		
		
		for(int i = 0; i < list1.length; i++)
		{
			if(list1[i] == list2[i])
			{
				
				철수 += 1;
				민수 += 1;
			}
			
			else if(list1[i] == 0 && list2[i] == 2 || list1[i] == 1 && list2[i] == 0 || list1[i] == 2 && list2[i] == 1)
			{
				철수 += 5;
				민수 -= 3;
			}
			
			else
			{
				민수 += 5;
				철수 -= 3;
			}
		}
		
		System.out.println("철수 = " + 철수 + " 민수 = " + 민수);
		

	}

}
