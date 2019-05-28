/**
 * @(#)qwe.java
 *
 * bcd application
 *
 * @author 
 * @version 1.00 2019/5/28
 */
 
import java.lang.*; 
import java.util.Scanner; 
 
 
public class qwe 
{
	public static void main(String args[])
    {
	CA objA = new CA();
	CB objB = new CB();        //obja子類別物件
	System.out.println("請輸入類別CA的obja物件資料");
	objA.inputX();
	objA.inputY();
	objA.inputZ();
	System.out.println("類別CA的obja物件資料");
	objA.show();	
	System.out.println("---------------------");	
	System.out.println("類別CB的obja物件資料");
	objB.inputX();
	objB.inputY();
	objB.inputZ();
	objB.varX++;
    objB.varY++;
    objB.addOne();
	System.out.print("類別B的obja物件資料");
	objB.show();
    }
}



class CA
{
	Scanner keyboardInput = new Scanner(System.in);
	public int varX;
	protected int varY;
	private int varZ;
	public void inputX()
	{
		System.out.print("varX:");  //提示使用者
	    varX = Integer.parseInt(keyboardInput.nextLine()); //把使用者輸入資料轉成整數存到這個變數
  	}
	public void inputY()
	{
	    System.out.print("varY:");  //提示使用者
	    varY = Integer.parseInt(keyboardInput.nextLine()); //把使用者輸入資料轉成整數存到這個變數
	 	
	}
	public void inputZ()
	{
	    System.out.print("varZ:");  //提示使用者
	    varZ = Integer.parseInt(keyboardInput.nextLine()); //把使用者輸入資料轉成整數存到這個變數	
	}
	public void show()
	{
	    System.out.println("varX=" + varX + "varY=" + varY +"varZ=" + varZ);  
	}
	
}    

 
class CB extends CA  //類別CB繼承自類別CA
{
	public int varW;
	public void addOne()
	{
		varX++;
		varY++;
	//	VarZ++;
				
	}	
	
}
