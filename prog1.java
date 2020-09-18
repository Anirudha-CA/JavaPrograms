import java.util.Scanner;

public class prog1 {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number");
            int n;
            n = scan.nextInt();
            if (n % 2 == 0)
            {
                if (n<5)
                {
                    System.out.println("Not Weird");
                }
                else
                {
                    if (n>5 && n<20)
                    {
                        System.out.println("Weird");
                    }
                    else if (n>20)
                    {
                        System.out.println("Not Weird");
                    }
                }
            }
            else
            {
                System.out.println("Weird");
            }
    }
}
