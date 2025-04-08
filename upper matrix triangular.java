import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i][j]==0)
                {
                    flag = 1;
                }
                else
                {
                    flag=0;  
                }
            break;
            }
        }
        if(flag==1)
        {
            System.out.println("Upper triangular matrix");
        }
        else
        {
            System.out.println("Not an Upper triangular matrix");
        }
    }
}
