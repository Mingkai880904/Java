/**
 * @(#)Main.java
 *
 * Main application
 *
 * @author 
 * @version 1.00 2019/6/4
 */
 
public class Main {   //�D���O
    
    public static void main(String[] args) //objB�O�l���O����
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
		System.out.println("�ثe������{����show()");
	}	
}


class CB extends CA  //�l���OCB�~�Ӧ����OCA
{
	public void show()
	{
		System.out.println("�ثe����l���O��show()");
	}
	public void show(int x)
	{
		System.out.println("�ثe����l���O��show("+ x +")");
	}
	public void show(double x)	
	{
		System.out.println("�ثe����l���O��show(double)");
		super.show();
	}		
}