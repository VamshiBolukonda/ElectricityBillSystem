import java.util.Scanner;
import billing.transaction; 
class login1                                                                          //CLASS
{
	int i;
    int uid,psw;
	Scanner s=new Scanner(System.in);
	menu m=new menu();
	signup1 si=new signup1();
	  login1()                                                                   //CONSTRUCTOR
	{
System.out .println("\n\n--------------------------LOGIN---------------------------------------\n");
System.out.println("\n\nalready a member??\n enter 1 for yes o for no");
		i=s.nextInt();
		if(i==0)
		{
			si.signup2();
        }
		else
		{
			lcheck();
		}
		}
		void lcheck()
		{
			System.out.println("user id :");
			uid=s.nextInt();
			System.out.println("password :");
			psw=s.nextInt();
			if(uid!=123 || psw!=456)
			{
	System.out.println("\n!!user id or password is incorrect please enter again!!");
				lcheck();
			}
			else
			{
				m.menu1();
			}
		}
    }

class signup1                                                                   //CLASS
{
	Scanner s=new Scanner(System.in);
	menu m=new menu();
	void signup2()
	{
	System.out.println("\n\n--------------------------SIGN UP---------------------------------------\n");
	System.out.print(" User id :");
	String name=s.nextLine();
	System.out.print(" phone number :");
	String phno=s.nextLine();
	System.out.print(" password :");
	int psd=s.nextInt();
	System.out.print(" re enter password:");
	int repsd=s.nextInt();
	if(psd==repsd)
	{
		m.menu1();
	}
	else
	{
	System.out.println("\n!!password doesn't match\nenter your details again!!");
		signup2();
	}
	}
}
class menu                                                                  //CLASS
{
	Scanner s=new Scanner(System.in);
	void menu1()
	{
	System.out.println("\n\n--------------------------HOME---------------------------------------\n");
	System.out.println("--> 1 for Dashboard");
	System.out.println("--> 2 for Bills");
	System.out.println("--> 3 for Transactions");
	System.out.println("--> 4 for Complaints");
	System.out.println("--> 5 for Logout");
	int i=s.nextInt();
	switch(i)
	{
		case 1 :
		{
			das d=new das();
			d.dashboard();
		}
		case 2 :
		{
			bill b=new bill();
			b.bill1();
			break;
		}
		case 3:
		{
			transaction t=new transaction();
			t.bills();
			break;
		}
		case 4:
		{
			complaints c=new complaints();
			c.bill1();
		}
                             case 5:
		{
			login1 l = new login1();	
		}
	}
	}
}
class das                                                                                       //CLASS
{    
    Scanner s=new Scanner(System.in);
	menu m=new menu();
	void dashboard()
	{
System.out.println("\n\n--------------------------DASHBOARD---------------------------------------\n");
System.out.println("DOMASTIC USAGE\n");
System.out.println("0-150 units------->2.75 /unit\n151-400 units------->4.80 /unit\nAbove 400 units------->5.20 /unit");
 System.out.println("\nCOMMERCIAL USAGE\n");
System.out.println("0-150 units------->5 /unit\n151-400 units------->5.30 /unit\nAbove 400 units------->5.60 /unit");
 System.out.println("\nINDUSTRIAL USAGE\n");
System.out.println("LARGE SCALE------->5 /unit\nMEDIUM SCALE------->4.70 /unit\nSMALL USAGE------->4.80 /unit");
System.out.println("\n\n\n1 for go back \n 2 for exit");
		int i=s.nextInt();
		if(i==1)
		{
			m.menu1();
			
		}
	}
}
class bill                                                                                           //CLASS
{
	Scanner s=new Scanner(System.in);
	transaction t=new transaction();
	menu m=new menu();
	void bill1()                                                                            //OVER RIDING
	{
System.out.println("\n\n--------------------------BILLING---------------------------------------\n");
System.out.println("enter the month of payment");
String mnth=s.nextLine();
System.out.println("enter units consumed");
int u=s.nextInt();
System.out.println("enter the sector\n 1 for DOMASTIC\n2 for COMMERCIAL\n3 for INDUSTRIAL");
		int j=s.nextInt();
	     double bill=0;
		switch(j)
		{
			case 1:
			       if(u<=150)
				   {
					   bill=u*2.75;
				   }
				   else if(u>=151 &&u<=400)
				   {
					   bill=u*4.80;
					}
					else
					{
						bill=u*5.20;
					}
					break;
			case 2:
			       if(u<=150)
				   {
					   bill=u*5;
				   }
				   else if(u>=151 &&u<=400)
				   {
					   bill=u*5.3;
					}
					else
					{
						bill=u*5.60;
					}
					break;
			case 3:
     System.out.println("enter usage scale");
     System.out.println("1 for large scale\n 2 for medium scale\n 3for small scale");
					int k=s.nextInt();
					switch(j)
		            {
			              case 1:
						       bill=u*5;
							   break;
						  case 2:
						       bill=u*4.70;
							   break;
						  case 3:
						       bill=u*4.80;
							   break;
					}
						
		}
	System.out.println("directing to transaction");
		 t.bills(bill);
	System.out.println("\n\n\n1 for go back \n 2 for exit");
		int i=s.nextInt();
		if(i==1)
		{
			m.menu1();
		}
	}
}
Final class complaints extends bill                                               //FINAL 
                                                                                                      //INHERITANCE
{
	Scanner s=new Scanner(System.in);
	void bill1()                                                                          //OVER RIDING
	{
	System.out.println("\n\n--------------------------COMPLAINTS---------------------------------------\n");
	System.out.println("Any issues ????\n type here :");
	String str= s.nextLine();
	System.out.println("your issue will be solved soon");
	 System.out.println("\n\n\n1 for go back \n 2 for exit");
		int i=s.nextInt();
		if(i==1){
			m.menu1();
		}
		else
		{
			
		}
	}
}
class ebs                                                                                             //CLASS
{
	static                                                                                      //STATIC
	{
System.out.println("\n\n--------------------------ELETRICITY BILLING SYSTEM---------------------------------------\n");
	}
	public static void main(String[] args)
	{
		login1 l = new login1();	                                           //OBJECT
	}
}
			












