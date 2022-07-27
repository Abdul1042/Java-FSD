import java.util.Scanner;
public class Practice_Problem2 
{
		public static void main(String args[]) 
		{
			String mail_id[]= {"abdullatiff7860gmail.com","xyz@yahoo.com","latiff@yahoo.com","zabrul@gmail.com","gunaprkash@outlook.com"};
			boolean b= false;
			Scanner s=new Scanner(System.in);
			System.out.print("enter the mail id:");
			String id=s.nextLine();
			//System.out.println(name.length());
			for (int a = 0; a < mail_id.length; a++) 
			{  
	            if(id.equals(mail_id[a])) 
	            {  
	                 b = true; 
	                 break;  
	            }  
			}  
	        if(b)  
	            System.out.println(id+ "\nThe Mail I'd you have entered is available ");  
	        else  
	            System.out.println(id+ "\nThe Mail I'd you have entred is not available ");  
		}
}

