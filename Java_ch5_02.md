 ```
 * @(#)abc.java
 *
 * abc application
 *
 * @author 
 * @version 1.00 2019/3/26
 */

package myJava.ch05;
import  java.lang.*;
import java.util.Scanner;

public class abc 
{

    public static void main(String args[])
    {
    	int sum=0;
    	double average;
    	Scanner keyboardInput = new Scanner(System.in);
    	
    	int trades[] = new int[4];
    	for(int element : trades)
    	{
    		System.out.print("各季的營業額:");
    		element = Integer.parseInt (keyboardInput.nextLine());
    		sum = sum + element;
    	}	
        average = (double)sum / (double)12;
        System.out.println("=====================");
        System.out.println("     年度營業額:" + sum);
        System.out.println("平均各月營業額:"  + average);
          //System.out.println("trades[0]=" + trades[0]);  
    }
}
```
