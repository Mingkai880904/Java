```
/**
 * @(#)Java_ch5_06.md.java
 *
 * Java_ch5_06.md application
 *
 * @author 
 * @version 1.00 2019/3/26
 */
 
package myJava.ch05;
import java.lang.*;

public class Java_ch5_06_md        //主類別
{
    public static void main(String args[])
    {
        int scores[][] = {{85,78,65},
                            {75},
                            {63,95},
                            {94,92,88}};
        int ary[];
        ary = scores[3].clone();
        scores[3][0]=0;
        for(int element : ary)
          System.out.println(element + "\t");
         
    }
}
```
