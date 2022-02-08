import java.util.*; 
import java.lang.*; 
  
public class staircase{ 
      
 
    public static int findStep(int n) 
    { 
        if (n == 1 || n == 0)  
            return 1; 
        else if (n == 2)  
            return 2; 
       
        else
            return findStep(n - 3) +  
                   findStep(n - 2) + 
                   findStep(n - 1);     
    } 
      
    // Driver function 
    public static void main(String argc[]){ 
        int n = 4; 
        System.out.println(findStep(n)); 
    } 
}
