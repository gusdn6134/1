package �����迭1;

import java.util.Arrays;
import java.util.Scanner;

public class �������迭_�˰���_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		 ���� 1) ������ ������ �� ���
		 ���� 1) 4400, 7100, 5400		
		 ���� 2) ȣ�� �Է��ϸ� ������ ���
		 ���� 2) �Է� : 202	������ ��� : 2000	
		 ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		 ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)		
		 ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)		
		 ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
	*/
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		
		int [] arr = new int[3];
		int index = 0;
		

		for(int i = 0; i < pay.length; i++) 
		{
			for(int j = 0; j < pay[i].length; j++)
			{
				arr[index] += pay[i][j];
			}
			index += 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("=========");
		System.out.print("ȣ �Է� : ");
		int num = scan.nextInt();

		int index1 = 0;
		int index2 = 0;
		
		for(int i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				
				if(num == apt[i][j])
				{
					index1 = i;
					index2 = j;
				}
				
			}
	}
		System.out.println("������ = " + pay[index1][index2]);
		System.out.println("=========");
		
		int max = 0;
		int min = 5000;
		
		int room1 = 0;
		int room2 = 0;
		
		for(int i = 0; i < pay.length; i++)
		{
			for(int j = 0; j < pay[i].length; j++)
			{
				if(max < pay[i][j])
				{
					max = pay[i][j];
					index1 = i;
					index2 = j;
				}
				
				if(min > pay[i][j])
				{
					min = pay[i][j];
					room1 = i;
					room2 = j;
				}
			}
		}
		
		System.out.println("������ ���� ���� ���� �� = " + apt[index1][index2] + " ������ ���� ���� ���� �� = " + apt[room1][room2]);
		System.out.println("=========");
		
		
		System.out.print("ù��° ȣ �Է� : ");
		int ho1 = scan.nextInt();
		System.out.print("�ι�° ȣ �Է� : ");
		int ho2 = scan.nextInt();
		
		
		for(int i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				if(ho1 == apt[i][j])
				{
					index1 = i;
					index2 = j;
				}
				
				if(ho2 == apt[i][j])
				{
					room1 = i;
					room2 = j;
				}
			}
	
		}
		
		int temp = pay[index1][index2];
		pay[index1][index2] = pay[room1][room2];
		pay[room1][room2] = temp;
		
		for(int i = 0; i < pay.length; i++)
		{
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println("=========");
		
		int [] aApt = new int [9];
		int [] aPay = new int [9];
		
		index = 0;
		for(int  i = 0; i < apt.length; i++) 
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				aApt[index] = apt[i][j];
				aPay[index] = pay[i][j];
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(aApt));
		System.out.println(Arrays.toString(aPay));
		
		for(int i = 0; i < aPay.length-1; i++)
		{
			max = 0;
			
			for(int j = i; j < aPay.length; j++)
			{
				if(aPay[i] < aPay[j])
				{
					max = aPay[j];
					aPay[j] =  aPay[i];
					aPay[i] = max;
					
					max = aApt[j];
					aApt[j] = aApt[i];
					aApt[i] = max;
				}
			}
		}
		
		System.out.println(Arrays.toString(aApt));
		System.out.println(Arrays.toString(aPay));
		
		index = 0;
		for(int  i = 0; i < apt.length; i++)
		{
			for(int j = 0; j < apt[i].length; j++)
			{
				apt[i][j] = aApt[index];
				pay[i][j] = aPay[index];
				index += 1;
			}
		}
		
		for(int i = 0; i < pay.length; i++)
		{
			System.out.println(Arrays.toString(apt[i]));
		}	
		
		for(int i = 0; i < pay.length; i++)
		{
			System.out.println(Arrays.toString(pay[i]));
		}
		
}
}