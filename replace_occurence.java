import java.util.Scanner;
import java.lang.String;
public class replace_occurence {
public static char[] replace(char str[],int l,char x,char y)
{
    if(l>=0)
    {
        if(str[l]==x)
        str[l]=y;
        return replace(str,l-1,x,y);
    }
    else
        return str;

}
    public static void main(String[] args) {
        String st;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string : ");
        st=s.next();
        int l=st.length();
        char str[]=new char[l];
        for (int i = 0; i < l; i++) {
            str[i]=st.charAt(i);
        }
        char x,y;
        System.out.println("Enter the element you want to replace: ");
        x=s.next().charAt(0);
        System.out.println("Enter the replaced element: ");
        y=s.next().charAt(0);
        char ch[]=replace(str,l-1,x,y);
        System.out.println("Replaced String: ");
        for (int i = 0; i < l; i++) {
            System.out.print(ch[i]);
        }

    }
}
