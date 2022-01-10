import java.util.Scanner;
public class company {
    int p[]=new int[3];
    //int b;
    //int c;

    public static void main(String[] args) {
        company salesman[]=new company[5];
        for(int i=0;i<salesman.length;i++)
        {
            salesman[i]=new company();
        }
        int temp=0;
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];

        int sale[]={0,0,0};
        for(int i=0;i<salesman.length;i++) {

            System.out.println("Enter the sales of 3 item sold by salesman " + (i + 1) + "=");
            for (int j = 0; j < 3; j++)
            {
                salesman[i].p[j] = s.nextInt();
                arr[i] = salesman[i].p[0] + salesman[i].p[1] + salesman[i].p[2];
                sale[j] += salesman[i].p[j];
            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Total sale by salesman "+(i+1)+"="+arr[i]);
        }

        for(int i=0;i<3;i++)
        {
            System.out.println("Total sale of item "+(i+1)+"="+sale[i]);
        }
    }
}