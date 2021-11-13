package LibraryManagement;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

class LibraryManagementSystem
{
	
	public static void main(String[] args) 
	{
	
		
		System.out.println("**Book Management System Login**");
	        System.out.println("Please enter your name");
	        String name = inputclass.sc.next();
	        
	        System.out.println("Please enter your role (1. ordinary user , 2. administrator)");
	        int role =inputclass.sc.nextInt();
	        if(role == 1)
	        {
	           User();
	        }
	        else    
	        {
	        	Admin();	
	        }
	}
	static void menu()
	{
		char r;
		do 
		{
		  
		System.out.println("*****Library Management*****");	
		System.out.println("Press 1 to add book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to display issue details book");
		System.out.println("Press 5 to exit");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int no=obj.nextInt();
		switch(no)
		{
		case 1:
			Library n1= new Library();
			n1.add();
			break;
			
		case 2:
			Library n2=new Library();
			n2.issue();
			break;
			
		case 3:
			Library n3=new Library();
			n3.ret();
			break;
			
		case 4:
			Library n4=new Library();
			n4.detail();
			break;
		
		case 5:
			Library n5=new Library();
			n5.exit();
			break;
			
		default:
			System.out.println("Invalid number");
		}
		
		System.out.println("You want to select next option Y/N");
		r=obj.next().charAt(0);
		}		
	while(r=='y'||r=='Y');
			
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			System.out.println("---Thank You for using the Library---");

			z.exit();
		
		}
		}

	 
static void User()
{
//Enter the account and password correctly, enter the library management system

 System.out.println("**Welcome to the library management system**");

 System.out.println("Please enter the account number:");
 int account = inputclass.sc.nextInt();           //Keyboard input account
 
 System.out.println("Please enter the password:");
 int pwd = inputclass.sc.nextInt();              //Keyboard input password

    //Determine whether the account and password are entered correctly

if(account==123456 && pwd==123456)
{
	menu();
}

else
{
System.out.println("The account or password is entered incorrectly!");            //The account or password is entered incorrectly
}
}
 
 static void Admin()
	{
		//Enter the account and password correctly, enter the library management system
		 System.out.println("**Welcome to the library management system**");
	       
	     System.out.println("Please enter the account number:");
		 int account = inputclass.sc.nextInt();//Keyboard input account
		 
		 System.out.println("Please enter the password:");
		 int pwd = inputclass.sc.nextInt();//Keyboard input password
	         //Determine whether the account and password are entered correctly
		if(account <= 12345 & pwd <= 12345)
	    {
			menu();
		}
		else 
		{
			 System.out.println("The account or password is entered incorrectly!");//The account or password is entered incorrectly
		}	
	
	}
	

public static class Library
{
	static String str,b,date,name;
	static int bookno,a,c,book_id,x;
	float price;
	void add()
	{
		System.out.println("Enter the book name ");
		 str=inputclass.sc.nextLine();
		 inputclass.sc.nextLine();
		 System.out.println("Enter the book ID " );
		 a=inputclass.sc.nextInt();
		System.out.println("Enter the book price ");
		 price=inputclass.sc.nextFloat();
		System.out.println("Book added successfully !!!" );

	}
	
	void issue()
	{
		System.out.println("Enter the student name ");
		 name=inputclass.sc.nextLine();
		 inputclass.sc.nextLine(); 
		
		System.out.println("Enter the book name ");
		 str=inputclass.sc.nextLine();
		 
		System.out.println("Enter the book ID " );
		 a=inputclass.sc.nextInt();
		 
		 LocalDateTime current= LocalDateTime.now();
		 System.out.println("Book issue date "+ current);

		System.out.println("Enter the number of books issued ");
		 c=inputclass.sc.nextInt();
		 
		System.out.println("Return book date ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
	        Calendar cal = Calendar.getInstance();
	        // get starting date
	        //cal.add(Calendar.DAY_OF_YEAR, 2);

	        // loop adding one day in each iteration
	        for(int i = 0; i< 5; i++)
	        {
	          cal.add(Calendar.DAY_OF_YEAR, 1);
	          //System.out.println(sdf.format(cal.getTime()));
	        }
	        System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("Book issued !!! ");


	}
	int getbook_id()
	{
		return a;
	}
	
	void ret()
	{
		System.out.println("Enter the Student name & book_id ");
		name= inputclass.sc.nextLine();
		book_id=inputclass.sc.nextInt();
		
		if(a==book_id)
		{
			System.out.println("Details: ");
			System.out.println("Enter the book name: " +Library.str);
			System.out.println("Enter the book id: " +Library.a);
			LocalDate now = LocalDate.now();
		        System.out.println("Enter the issue date: " +now);
			System.out.println("Enter the number of books issued : " +Library.c);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		        Calendar cal = Calendar.getInstance();
		        // get starting date
		        //cal.add(Calendar.DAY_OF_YEAR, -6);

		        // loop adding one day in each iteration
		        for(int i = 0; i< 5; i++)
		        {
		         cal.add(Calendar.DAY_OF_YEAR, 1);
		         // System.out.println(sdf.format(cal.getTime()));
		        }
		        //System.out.println(sdf.format(cal.getTime()));*/
		        System.out.println("Enter the book return date: " +sdf.format(cal.getTime()));
			System.out.println("Book received!!! ");

		}
		else
		{
			System.out.println("Invalid ID");
		}
		}
	
   void detail()
   {
	        System.out.println("Book name: " +Library.str);
		System.out.println("Book id: " +Library.a);
		LocalDate now = LocalDate.now();
	        System.out.println("Book issue date: " +now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
	        Calendar cal = Calendar.getInstance();
	        // get starting date
	        //cal.add(Calendar.DAY_OF_YEAR, -6);

	        // loop adding one day in each iteration
	        for(int i = 0; i< 6; i++)
	        {
	          cal.add(Calendar.DAY_OF_YEAR, 1);
	          // System.out.println(sdf.format(cal.getTime()));
	        }
	        //System.out.println(sdf.format(cal.getTime()));*/
	        System.out.println("Book return date: " +sdf.format(cal.getTime()));
   }
	
   
   void exit()
   {
	   System.exit(0);
   }
}
}
class inputclass
{
static Scanner sc=new Scanner(System.in);
}
