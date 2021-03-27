import java.util.Scanner;

public abstract class BoxW {
    public static int width;

    public abstract void printDimensions();
}

public abstract class BoxH extends BoxW {
    public static int height;

    public abstract void printDimensions();
}

public abstract class BoxD extends BoxH {
    public static int depth;

    public abstract void printDimensions();
}

class c extends BoxD {
    public static void printDimensions(int j) {
        System.out.println(j);
    }
}

public class override extends c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();
        System.out.print("WIDTH=");
        printDimensions(width);
        System.out.print("HEIGHT=");
        printDimensions(height);
        System.out.print("DEPTH=");
        printDimensions(depth);
    }
}