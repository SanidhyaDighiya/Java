 import java.util.Scanner;
public class Timestamp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String str1[] = s1.split(":");
        String str2[] = s2.split(":");
        stamp Time1 = new stamp();
        stamp Time2 = new stamp();
        Time1.hour = Integer.parseInt(str1[0]);
        Time1.minute = Integer.parseInt(str1[1]);
        Time1.second = Integer.parseInt(str1[2]);
        Time2.hour = Integer.parseInt(str2[0]);
        Time2.minute = Integer.parseInt(str2[1]);
        Time2.second = Integer.parseInt(str2[2]);
        addTimestamps(Time1, Time2);
    }
    public static String addTimestamps(stamp a, stamp b)
    {
        int h,m,s;
        if((a.second + b.second)<= 60)
        {
            s = a.second + b.second;
            if((a.minute + b.minute)<=60)
            {
                m = a.minute + b.minute;
                h = a.hour + b.hour;
            }
            else
            {
                m = a.minute + b.minute - 60;
                h = a.hour + b.hour + 1;
            }
        }
        else
        {
            s = a.second + b.second - 60;
            if((a.minute + b.minute + 1)<=60)
            {
                m = a.minute + b.minute + 1;
                h = a.hour + b.hour;
            }
            else
            {
                m = a.minute + b.minute + 1 - 60;
                h = a.hour + b.hour + 1;
            }
        }
	System.out.println(h+":"+m+":"+s);
        return "ANS";
    }
}
class stamp
{
    int hour, minute, second;
}