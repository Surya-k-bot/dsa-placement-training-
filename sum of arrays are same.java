import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        for(int i=0;i<=n1-1;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<=n2-1;i++){
            a2[i]=sc.nextInt();
        }
        int s1=0,s2=0;
        for(int i=0;i<=n1-1;i++){
            s1=s1+a1[i];
        }
        for(int i=0;i<=n2-1;i++){
            s2=s2+a2[i];
        }
        if(s1==s2&&n1==n2)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
        
    }     
}
