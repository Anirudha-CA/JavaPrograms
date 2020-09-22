import java.util.Scanner;
public class sqsum {
    public int s(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum*sum;
    }
    public int s(int a,int b,int c)
    {
        int sum;
        sum=a+b+c;
        return sum*sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sqsum o1 = new sqsum();
        sqsum o2 = new sqsum();
        int n,a,b,c,sq;
        System.out.println("Enter number of inputs");
        n = sc.nextInt();
        if (n==2)
        {
            System.out.println("Enter two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            sq=o1.s(a,b);
            System.out.println("The square of the numbers is"+sq);
        }
        else
        {
            System.out.println("Enter three numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            sq=o2.s(a,b,c);
            System.out.println("The square of three numbers is "+sq);
        }

    }
}
