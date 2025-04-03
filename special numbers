import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int t,s,p;
        for(int i=n;i<=m;i++){
            t=i;
            s=0;
            p=1;
            while(t!=0){
                s=s+(t%10);
                p=p*(t%10);
                t=t/10;
            }
            if(i==(p+s)){
                System.out.println(i);
            }
        }
    }
}
