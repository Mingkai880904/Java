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
	CB objB = new CB();        //obja�l���O����
	System.out.println("�п�J���OCA��obja������");
	objA.inputX();
	objA.inputY();
	objA.inputZ();
	System.out.println("���OCA��obja������");
	objA.show();	
	System.out.println("---------------------");	
	System.out.println("���OCB��obja������");
	objB.inputX();
	objB.inputY();
	objB.inputZ();
	objB.varX++;
    objB.varY++;
    objB.addOne();
	System.out.print("���OB��obja������");
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
		System.out.print("varX:");  //���ܨϥΪ�
	    varX = Integer.parseInt(keyboardInput.nextLine()); //��ϥΪ̿�J����ন��Ʀs��o���ܼ�
  	}
	public void inputY()
	{
	    System.out.print("varY:");  //���ܨϥΪ�
	    varY = Integer.parseInt(keyboardInput.nextLine()); //��ϥΪ̿�J����ন��Ʀs��o���ܼ�
	 	
	}
	public void inputZ()
	{
	    System.out.print("varZ:");  //���ܨϥΪ�
	    varZ = Integer.parseInt(keyboardInput.nextLine()); //��ϥΪ̿�J����ন��Ʀs��o���ܼ�	
	}
	public void show()
	{
	    System.out.println("varX=" + varX + "varY=" + varY +"varZ=" + varZ);  
	}
	
}    

 
class CB extends CA  //���OCB�~�Ӧ����OCA
{
	public int varW;
	public void addOne()
	{
		varX++;
		varY++;
	//	VarZ++;
				
	}	
	
}
