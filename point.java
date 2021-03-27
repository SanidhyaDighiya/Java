import java.util.Scanner;
public class point
{
    double x_coordinate, y_coordinate;

    public point(double a, double b)
    {
        x_coordinate=a;
        y_coordinate=b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        point p1 = new point(c, d);
        point p2 = new point(e, f);
        float dist = p1.findDistance(p2);
        System.out.printf("%.2f", dist);
    }
    float findDistance(point p3)
    {
        double dx = x_coordinate - p3.x_coordinate;
        double dy = y_coordinate - p3.y_coordinate;
        double s = (dx*dx)+(dy*dy);
        float ms = (float)Math.sqrt(s);
        return ms;
    }
}