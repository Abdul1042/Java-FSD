//import java.util.HashMap;
//import java.util.LinkedList;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.io.*;
import java.util.Scanner;

	public class Movie_ticket{
		public static void main(String args[]) {
			//JButton Print;
	 				LinkedList<String> A=new LinkedList<String>();
	 				LinkedList<String> B=new LinkedList<String>();
	 				LinkedList<String> C=new LinkedList<String>();
	 				LinkedList<String> D=new LinkedList<String>();
	 				LinkedList<String> E=new LinkedList<String>();
	 				for(int i=0;i<10;i++){
	 					A.add("1");
	 					B.add("1");
	 					C.add("1");
	 					D.add("1");
	 					E.add("1");
	 				}
	 				A.set(6,"0");
	 				A.set(9,"0");
	 				A.set(5,"0");
	 				for(int i=0;i<6;i++){
	 					B.set(i,"0");
	 				}
	 				for(int i=0;i<10;i++){
	 					if(i%2==0){
	 					C.set(i,"0");}
	 				}
	 				for(int i=0;i<10;i++){
	 					if(i%2!=0){
	 					D.set(i,"0");}
	 				}
	 				Scanner sc=new Scanner(System.in);
	 				System.out.println("Are you Admin or User? \n If Admin press 'A' if User press 'U'");
	 				char ch=sc.next().charAt(0);
	 				while(ch!='A'&&ch!='U')
	 				{
	 					System.out.println("You selected incorrect option, choose correct option");
	 					System.out.println("Are you Admin or User? \n If Admin press 'A' if User press 'U'");
	 					ch=sc.next().charAt(0);
	 				}
	 				String s,s1;
	 				switch (ch)
	 				{
	 				case 'A':
	 				{
	 					System.out.println("Do you want to update your password? \n If yes press 'Y', if no press 'N'");
	 					ch=sc.next().charAt(0);
	 					while(ch!='Y'&&ch!='N')
	 					{
	 						System.out.println("You selected incorrect option, choose correct option");
	 						System.out.println("Do you want to update your password? \n If yes press 'Y', if no press 'N'");
	 						ch=sc.next().charAt(0);
	 					}
	 					if(ch=='Y')
	 					{
	 						System.out.println("Enter old password");
	 						sc.nextLine();
	 						s=sc.nextLine();
	 						System.out.println("Enter new password");
	 						s=sc.nextLine();
	 						System.out.println("Confirm new password");
	 						s1=sc.nextLine();
	 						while(!(s.equals(s1))){
	 							System.out.println("Password not matching");
	 							System.out.println("Enter new password");
	 	 						s=sc.nextLine();
	 	 						System.out.println("Confirm new password");
	 	 						s1=sc.nextLine();
	 						}
	 						System.out.println("Password updated successfully");
	 					}
	 					else
	 					{
	 						System.out.println("Exited successfully");
	 					}
	 					break;
	 					
	 				}
	 				case 'U':
	 				{
	 					System.out.println("Select the Show time: ");
	 					show_time user=new show_time();
	 					System.out.println("Available seats");
	 					LinkedList<String> f= new LinkedList<>(); 
	 					for(int i=0;i<10;i++){
	 						if(A.get(i)=="0"){
	 							f.add("A"+(i+2));
	 							System.out.print("A"+(i+2)+" ");
	 						}
	 					}
	 					for(int i=0;i<10;i++){
	 						if(B.get(i)=="0"){
	 							f.add("B"+(i+2));
	 							System.out.print("B"+(i+2)+" ");
	 						}
	 					}
	 					for(int i=0;i<10;i++){
	 						if(C.get(i)=="0"){
	 							f.add("C"+(i+2));
	 							System.out.print("C"+(i+2)+" ");
	 						}
	 					}
	 					for(int i=0;i<10;i++){
	 						if(D.get(i)=="0"){
	 							f.add("D"+(i+2));
	 							System.out.print("D"+(i+2)+" ");
	 						}
	 					}
	 					for(int i=0;i<10;i++){
	 						if(E.get(i)=="0"){
	f.add("E"+(i+1));
	 							System.out.print("E"+(i+1)+" ");
	 						}
	 					}
	 					System.out.println("\nEnter the Number of seats");
	 					int x=sc.nextInt();
	 					String arr[]=new String[x];
	 					System.out.println("Select the seats number form the list");
	 					for(int i=0;i<x;i++){
	 						arr[i]=sc.next();
	 						while(!(f.contains(arr[i]))){
	 							System.out.println("select the appropriate seat");
	 							arr[i]=sc.next();
	 						}
	 					}
	 					System.out.println("Total Price for "+x +" seats is Rupees."+(x*120)+"/- only....!"+"\nEnter\n1 For confirmation of ticket\n2 For canceling the ticket");
	 					int y=sc.nextInt();
	 					sc.nextLine();
	 					String user_id;
	 					long num;
	 					if(y==1){
	 						int b2=user.show;
	 						System.out.println("User Name: ");
	 						user_id=sc.nextLine();
	 						System.out.println("Please enter your mobile Number: ");
	 						num=sc.nextInt(10);
	 						System.out.println("Name: "+user_id+"\nPhone Number: "+num+"\nmoving timing: "+user.time1()+"\nNumber of Seats "+x);
	 						System.out.print("selected seats are : ");
	 	 					for(int i=0;i<x;i++){
	 	 						System.out.print(arr[i]+" ");
	 	 					}
	 	 					System.out.println("\nAmount to be paid "+((x*120)+(x*80))+"Tax included of rupees "+(x*80)+"\nEnter the amount to confirm seats");
	 	 					//Print = new JButton("Print");
	 	 					//Print.setBackground(Color.cyan);					
	 	 					int x1=sc.nextInt();
	 	 					while(x1!=(x*120+(x*80))){
	 	 						System.out.println("invalid amount\nEnter "+(x*120));
	 	 						x1=sc.nextInt();
	 	 					}
	 	 					System.out.println("Ticket Booked\nEnjoy your show\tThank you");
	 					}
	 					else{
	 						System.out.println("Thank you");
	 					}
			}
	   	} 
	 }
}

 	class show_time{
		int show;
		HashMap<Integer,String> hm=new HashMap<>();
		show_time(){
			System.out.println("1->10.30 AM  2->2.15 PM  3->6.15 PM  4->10.00 PM");
			Scanner sc=new Scanner(System.in);
			show=sc.nextInt();
			while(show!=1&&show!=2&&show!=3&&show!=4){
				System.out.println("choose the coorrect timing");
				System.out.println("1->10.30 AM  2->2.15 PM  3->6.15 PM  4->10.00 PM");
				show=sc.nextInt();
			}
			hm.put(1,"10.30 AM");
			hm.put(2,"2.15 PM");
			hm.put(3,"6.15 PM");
			hm.put(4,"10.00 PM");
		}
			String time1(){
				return(hm.get(show));
			}
	}
	

