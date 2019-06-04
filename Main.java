/**
 * @(#)Main.java
 *
 * Main application
 *
 * @author 
 * @version 1.00 2019/6/4
 */
 
public class Main {   //主類別
    
    public static void main(String[] args) //objB是子類別物件
    {
    	CB objB = new CB();
    	objB.show();
    	objB.show(10);
    	objB.show(10.0);	
    }
}

class CA
{
	public void show()
	{
		System.out.println("目前執行父程式的show()");
	}	
}


class CB extends CA  //子類別CB繼承自類別CA
{
	public void show()
	{
		System.out.println("目前執行子類別的show()");
	}
	public void show(int x)
	{
		System.out.println("目前執行子類別的show("+ x +")");
	}
	public void show(double x)	
	{
		System.out.println("目前執行子類別的show(double)");
		super.show();
	}		
}