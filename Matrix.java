import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        int i,j,m,n,p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix 1");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter order of matrix 2");
        p = sc.nextInt();
        q = sc.nextInt();
        int arr[][]= new int[m][n];
        int brr[][]= new int[p][q];
        int crr[][]= new int[m][q];
        System.out.println("Enter elements of matrix 1");
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elments of matrix 2");
        for (i=0;i<p;i++){
            for (j=0;j<q;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        if (m == p && n == q)
        {
            for (i=0;i<p;i++){
                for (j=0;j<q;j++){
                    crr[i][j]=arr[i][j]+brr[i][j];
                }
            }
            System.out.println("Sum of Matrix");
            for (i=0;i<p;i++){
                for (j=0;j<q;j++){
                    System.out.println(crr[i][j]+"");
                    System.out.println();
                }
            }
        }
        else
            System.out.println("Matrices adding is impossible");
    }
}
