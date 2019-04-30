/**
 * @(#)fibabc.java
 *
 * fibabc application
 *
 * @author 
 * @version 1.00 2019/4/30
 */
 
public class fibabc
{
    public static void main(String args[])
    {
        System.out.print("費氏數列如下:");
        for(int i=0;i<=44;i++)
        {
           if(i%8==0)
              System.out.println();
           System.out.print(Fib(i) + "\t");
           System.out.println(Fib2(i) + "\t");
        }   
        System.out.println("......");
    } 
    
    public static int Fib2(int n){
    	int i,f1,f2,f3;
    	if((n==1) || (n==0)){
           return n;
    	}else{
    	   f1=0;f2=1;f3=0;
    	   for(i=2;i<=n;i++){
    	   	f3=f1+f2;
    	   	f1=f2;	
    	   	f2=f3;	
    	   }
           return f3;
           }
  } 
    public static int Fib(int n)
    {
        if((n==1) || (n==0))
          return n;
        else
          return Fib(n-1) + Fib(n-2);
    }
}