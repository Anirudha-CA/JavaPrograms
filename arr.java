public class arr {
    public static void main(String[] args)
    {
        int [] arr = {17,22,31};
        int sum = 0;
        float avg = 0;
        int i,j;
        for (i = 0;i<3;i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements "+sum);
        for (i = 0;i<3;i++) {
            avg = avg + (arr[i] / 3);
        }
        System.out.println("Average is "+ avg);




    }
}
