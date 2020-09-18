import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,i=0,f=0,s=1,l;
        System.out.println("Enter Limit");
        n = scan.nextInt();
        while (i < n)
        {
            if (i <= 1)
            {
                l = i;
            }
            else
            {
                l = f + s;
                f = s;
                s = l;
            }
            System.out.println(l);
            i++;
        }

    }
}
