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
```
/**
 * @(#)ex_0505.java
 *
 * ex_0505 application
 *
 * @author 
 * @version 1.00 2019/3/26
 */

package myJava.ch05;
import java.lang.*;

public class ch_05_2         //主類別
{
    public static void main(String args[])
    {
        double scores[][] = {{85,78,65,0},
                            {75,85,69,0},
                            {63,67,95,0},
                            {94,92,88,0},
                            {74,65,73,0}};
 
        System.out.println("計概\t數學\t英文\t平均");
        System.out.println("==============================");
        for(int i=0;i<5;i++)
        {
          scores[i][3] = (scores[i][0]+scores[i][1]+scores[i][2])/3;
          for(int j=0;j<4;j++)
             System.out.print(scores[i][j] + "\t");
          System.out.println();
        }  
    }
}
```
