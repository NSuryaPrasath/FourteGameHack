package newclass;

import java.util.Random;
import java.util.Scanner;

public class ForteGame 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		boolean flag=true;
		int total=45;
		int arr[]={7,9,4,3};
		char operator[]= {'+','-','*','/'};
		int sum=0,k=0;
		while(sum!=total)
		{
			int i=0;
			for(int j=0;j<3;j++)
			{
				if(sum<total)
				{
					char incre[]= {'+','*'};
					if(i==2)
					{
						break;
					}
					char in=incre[i++];
					if(k<4)
					{
						switch(in)
						{
							case '+':sum+=arr[k++]+arr[k++];break;
							case '*':sum+=arr[k++]*arr[k++];break;
							default:System.out.println("Invalid");
						}
					}
//					System.out.print(sum+" "+arr[j]+" "+in+" "+arr[j+1]);
//					System.out.println();
				}
				else
				{
					//int i=0;
					char decre[]= {'-','/'};
					if(i==0)
					{
						break;
					}
					char de=decre[i--];
					if(k<4)
					{
						switch(de)
						{
							case '-':sum-=arr[k++]-arr[k++];break;
							case '/':sum+=arr[k++]/arr[k++];break;
							default:System.out.println("Invalid");
						}
					}
//					System.out.print(sum+" "+arr[j]+" "+de+" "+arr[j+1]);
//					System.out.println();
				}
			}
		}
		System.out.println("="+sum);
	}
}
