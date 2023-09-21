import java.util.Scanner;
class ebs
{
	public static void main(String arg[])
	{	
	Scanner s =new Scanner(System.in);
	login l=new login();
	 l.login1();
	}
}
class login
{ 
    Scanner s =new Scanner(System.in);
	signup s1=new signup();
	 int id;
	int pswd;
    int i;
	public void login1()
	{
		System.out.print("user id :");
        id=s.nextInt();
		System.out.print("password :");
		pswd=s.nextInt();
	    if(id==1234 && pswd==567)
		{
			
		}
		else
		{
			System.out.println("user id or password doesn't match\n sign up??");
			System.out.println("enter y for yes and n for no");
			i=s.nextInt();
			if(i==1)
			{
			  
			  s1.signup1();
				
		    }
		
	}
		
}
}class signup extends login
{
	 int name;
	int pno;
	 int psd;
	 int rpsd;
	 int usid;

	 void signup1()
	{
		
	System.out.print("name : ");
	name=s.nextInt();
	System.out.print("phone number : ");
	pno=s.nextInt();
	System.out.print("enter your user id : ");
	usid=s.nextInt();
	System.out.print("new password : ");
	psd=s.nextInt();
	System.out.print("re-enter your password  : ");
	rpsd=s.nextInt();
	if(psd!=rpsd)
	{
		System.out.println("password doesn't match\nenter your details again");
		signup1();
	}
	}
	
}

