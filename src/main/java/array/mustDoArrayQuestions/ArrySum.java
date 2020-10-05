package array.mustDoArrayQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-->0)
        {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]="sc.nextInt();" for(int="" i="0;i&lt;n;i++)" {="" int="" s="0;" for(int="" j="i;j&lt;n;j++)" {="" s+="arr[j];" if(s="=sum)" {="" s="0;" system.out.println((i+1)+"="" "+(j+1));="" break;="" }="" else="" if(s="">sum)
            break;
        else
            continue;
        }
            if(s==0)
                break;
            if(i==n-1)
            {
                System.out.println("-1");
                break;
            }
        }
        }
    }
}
