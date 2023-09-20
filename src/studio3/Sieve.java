package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Value for n?");
		int n = in.nextInt();
		
		int pri[] = new int[n+1];
		
        for(int i=0; i<=n ;i++)
        { pri[i] = 1;
        }
        
        for (int num = 2; num*num <= n; num++)
        {
        	if (pri[num] == 1)
        	{
        		for (int p = num*num; p <= n; p=p+num)
        		{
        			pri[p] = 0;
        		}
        	}
        }
		
        for (int k = 2; k <= n; k++)
        {
        	if (pri[k] == 1) 
        	{
        		System.out.print(k + " ");
        	}
        	
	}

}
}