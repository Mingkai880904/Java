```
/**
 * @(#)ch5_08.java
 *
 * ch5_08 application
 *
 * @author 
 * @version 1.00 2019/3/26
 */
 
package myJava.ch05;
import java.lang.*;
import java.util.Arrays;   //引入Arrays類別

public class ch5_08         //主類別
{
    public static void main(String args[])
    {
       int x[]={25,10,39,40,33,12};
       int spec=11;
         
       Arrays.sort(x);
       for(int num : x)
            System.out.print(num+ "\t");
       System.out.println("\n特別號\t" + spec); 
    }
}
```
