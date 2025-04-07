import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int comp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        if(n==m)
        {
            for(int i=0;i<n;i++)
            {
                if (a[i]>=b[i])
                {
                comp=1;
                }
            
            else
            {
                comp=0;
                 break;
            }
        }
      }
           
        if(comp==1)

        {
            System.out.println("Compatible");
        }
        else
        {
            System.out.println("Incompatible");
        }    
    }
}
