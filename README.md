# Java Point：

## 1.物件3元素：封裝、繼承、多型
* A.封裝-public(大)、private(小)
* 鴨上車、鴨破、鴨制、鴨鴨幫、王文彥

## 更細分來說，物件導向程式設計將物件的資料與方法「至少」區分為三種等級： 
* public	 ：公用等級
* private	 ：私用等級
* protected：保護等級（註：Java的封裝等級還需要考量到package的影響，留待第11章說明）

## 2.回傳值型態、參數型態、名稱
https://programming.im.ncnu.edu.tw/J_index.html

## 3.Java.util.scanner
https://dotblogs.com.tw/freedom42408/archive/2013/11/20/130586.aspx
* 第一種 nextInt()：取得使用者輸入的整數
```
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入三個數字(以空白鍵分開)：");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        System.out.println("您輸入第一個數字為：" + num1 );
        System.out.println("您輸入第二個數字為：" + num2 );
        System.out.println("您輸入第三個數字為：" + num3 );

    }
}
```
* 第二種 nextFloat()：取得使用者輸入的浮點數
```
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        float float1, float2, float3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入三個浮點數(以Tab鍵分開)：");
        float1 = scanner.nextFloat();
        float2 = scanner.nextFloat();
        float3 = scanner.nextFloat();
        System.out.println("您輸入第一個浮點數為：" + float1 );
        System.out.println("您輸入第二個浮點數為：" + float2 );
        System.out.println("您輸入第三個浮點數為：" + float3 );

    }
}
```
* 第三種 nextLine()：取得使用者輸入的字串(包含空白字元、空白鍵、Tab)
```
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入一字串：");
        str1 = scanner.nextLine();
        System.out.println("您輸入的字串一為：\n" + str1 );

    }
}
```
* 第四種 next()：取得使用者輸入的字串(不包含空白字元、空白鍵、Tab)
```
import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        String str1, str2, str3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入一字串：(不包含空白字元、空白鍵、Tab)");
        str2 = scanner.next();
        System.out.println("您輸入的字串一為：\n" + str2 );
    }
}
```
