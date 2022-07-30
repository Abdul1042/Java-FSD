import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice_Problem3 {
	
	public static void main(String args[]) {
		char set[] = new char[50];
		Scanner sc0= new Scanner(System.in);  
		System.out.println("\n\tFile Handling\n1.Writing the file\n2.Reading the file\n3.Appending the file");  
		  System.out.print("Enter the function choice: ");  
		  int a= sc0.nextInt(); 
		  switch (a)
		  {
		  case 1:
		  {
			  System.out.print("Enter a string to write: ");
			  Scanner sc1= new Scanner(System.in);  
			  String data= sc1.nextLine();       
			    
			    try 
			    {
			      FileWriter output = new FileWriter("E:\\Project\\Text.txt");
			      output.write(data);
			      System.out.println("Data is written to the file.");
			      output.close();
			    }
			    catch (Exception e) {
			      e.getStackTrace();
			    }
			    break;
		  }
		  case 2:
		  {

			    try {
				      
				      FileReader input = new FileReader("E:\\Project\\File.txt");
				      input.read(set);
				      System.out.println("The entered consist of the following:");
				      System.out.println(set);
				      input.close();
				    }
				    catch(Exception e) {
				      e.getStackTrace();
				    }
				  break;
		  }
		  case 3:
		  {
			  System.out.print("Enter a string to Append: ");
			  Scanner sc2= new Scanner(System.in);  
			  String data= sc2.nextLine();     
			  try {
			         
			         File f = new File("E:\\Project\\Text.txt");
			         if(!f.exists()) 
			         {
			            f.createNewFile();
			         }

			         FileWriter fileWritter = new FileWriter(f,true);
			         BufferedWriter bw = new BufferedWriter(fileWritter);
			         bw.write(data);
			         bw.close();
			         System.out.println("The String is Appended Sucessfully ");
			      } catch(IOException e){
			         e.printStackTrace();
			      }
	}

  }
}
}
