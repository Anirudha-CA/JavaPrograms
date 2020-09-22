import java.util.Scanner;
public class cons {
    cons(int roll)
    {
        System.out.println("Name: Unknown");
        System.out.println("Roll number: "+roll);
    }
    cons(String name,int roll)
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll);
    }
    public static void main(String[] args){
        int rolln;
        String names;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and roll number");
        names = sc.nextLine();
        rolln = sc.nextInt();
        cons s1 = new cons(names,rolln);
        cons s2 = new cons(rolln);
    }

}
