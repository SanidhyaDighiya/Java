import java.util.Scanner;
public class candle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = (int)(c/d);
        int j = e;
        int i = 0;
        int f = (c%d);
        c+=e;
        for(;;)
        {
            int k = e+f;
            e=(int)(k/d);
            c+=e;
            f=(int)(k%d);
            i++;
            if((e+f)<d)
                break;
        }
        System.out.println(c);
    }
}