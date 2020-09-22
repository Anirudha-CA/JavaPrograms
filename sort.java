import java.util.Scanner;
public class sort {
    public static void main(String[] args){
        int i,n,j,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
            for (j=0;j<(n-i)-1;j++)
            {
                if (arr[j]>arr[j+1]){
                    t= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
            }
            System.out.println("Sorted Array");
            for (i=0;i<n;i++)
                System.out.println(arr[i]);
        }
    }
}
