import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0)
            System.out.println("1");
        else
        {
            if(x == 1)
                System.out.println("2,3");
            else
            {
                int a=0;
                int b=1;
                int c=a+b;
                int n=3;
                while(c>0)
                {
                    a=b;
                    b=c;
                    c=a+b;
                    n+=1;
                    if(x==c)
                    {
                        System.out.println(n);
                        break;
                    }
                }
            } 
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}