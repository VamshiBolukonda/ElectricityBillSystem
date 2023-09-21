package billing;                                                                              //PACKAGE
import java.util.*;  
public class  transaction
{
	Scanner sc = new Scanner(System.in); 
   double bill;
 public void bills()                                                      //ACCESS MODIFIER (PUBLIC)
                                                                                                    //OVER LOADING
 {
	  System.out.println("Enter your userid:");
	int uid=sc.nextInt();
	System.out.println("Enter the bill to be paid");
	 bill=sc.nextDouble();
 System.out.println("Enter your payment mode 1.credit card 2.Debit card 3.UPI:");
	int mode=sc.nextInt();
	System.out.println("Enter 1. To pay  2. To pay later:");
	int i=sc.nextInt();
System.out.println("The electricity bill of : " + bill+"has been paid succesfully");   
	return;
 }


