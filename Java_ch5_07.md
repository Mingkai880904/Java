```
/**
 * @(#)ch5_07.java
 *
 * ch5_07 application
 *
 * @author 
 * @version 1.00 2019/3/26
 */

package myJava.ch05;
import java.lang.*;

public class ch5_07         //主類別
{
    public static void main(String args[])
    {
        char[] ary1={'T','h','e','J','a','v','a','2'};
        char[] ary2={'H','e','l','l','o',' ','T','i','m','e','!'};

        System.arraycopy(ary1,3,ary2,6,4);
        for(char element :  ary2)
           System.out.print(element);
    }
}
```
