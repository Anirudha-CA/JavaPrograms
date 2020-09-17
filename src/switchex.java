import java.util.Scanner;
public class switchex {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int a;
       int b;
       char o;
       int n;
       System.out.println("Enter Statement");
       a = scan.nextInt();
       b = scan.nextInt();
       o = scan.next().charAt(0);
       switch (o)
       {
           case '+':n = a + b;
           break;
           case '-':n = a - b;
           break;
           case '*':n = a * b;
           break;
           case '/':n = a / b;
           break;
           default:System.out.println("Incorrect Operator");
           return;
       }
       System.out.println(n);
    }
}
