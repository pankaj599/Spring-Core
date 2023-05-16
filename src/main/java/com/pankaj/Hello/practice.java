package com.pankaj.Hello;

public class practice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=0;i<5;i++)
		{System.out.println("inside for");
			if(i==3)
			{
				flag=true;
				break;
			}
			System.out.print(" "+ i+" " +flag);
		}
System.out.println("outside for "+ flag);
	}

}
