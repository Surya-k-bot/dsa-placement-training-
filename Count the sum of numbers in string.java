import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char ch[]=n.toCharArray();
        int ln=n.length();
        int s,ts=0;
        for(int i=0;i<ln;i++)
        {
            s=0;
            if(ch[i]>='0'&&ch[i]<='9')
            {
                while(i<ln &&(ch[i]>='0'&& ch[i]<='9'))
                {
                    s=s*10+(int)ch[i]-48;
                    i++;
                }
                ts=ts+s;
            }
        }
        System.out.print(ts);
        
    }
}
