import java.util.Scanner;
public class sum_arrayelement_recursion {
public static int s=0;
    public static int sum(int arr[],int n)
    {
        if(n>=0)
        {
            s=s+arr[n];
            return sum(arr, n-1);
        }
        else
            return s;

    }
    public static void main(String[] args) {
        int n;
        Scanner s=new  Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Sum of the array= "+sum(arr,n-1));
    }
}
