import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Bug_fix {
	
public static void main(String args[]) {
	      Selection();
}

private static void Selection() {
String[] arr = {"\n1. Review my expenditure",
            "2. Add to my expenditure",
            "3. Delete my expenditure",
            "4. Sort my expenditures",
            "5. Search a particular in my expenditure",
            "6. Exit"
    };
    int[] arr1 = {1,2,3,4,5,6};
    int  strlen = arr1.length;
    for(int i=0; i<strlen;i++){
        System.out.println(arr[i]);
       }
     ArrayList<Integer> arrlist = new ArrayList<Integer>();
     ArrayList<Integer> expenses = new ArrayList<Integer>();
    expenses.add(1500);
    expenses.add(5500);
    expenses.add(2500);
    expenses.add(4500);
    expenses.add(3500);
    expenses.addAll(arrlist);
    System.out.println("\nEnter your choice:\t");
    Scanner sc = new Scanner(System.in);
    
    int  choice =  sc.nextInt();
    for(int a=1;a<=strlen;a++){
        if(choice==a){
            switch (choice){
                case 1:
                    System.out.println("Your saved expenses are listed : ");
                    System.out.println(expenses+"\n");
                    Selection();
                    break;
                case 2:
                    System.out.println("Enter the value to add your Expense: \n");
                    int value = sc.nextInt();
                    expenses.add(value);
                    System.out.println("Your value is updated in expenditure..\n");
                    expenses.addAll(arrlist);
                    System.out.println(expenses+"\n");
                    Selection();
                    break;
                case 3:
                    System.out.println("You are about the delete all your expenses! \nConfirm again by entering 1(for Yes) or 2(for No) \n");
                    int con_choice = sc.nextInt();
                    if(con_choice==1){
                           expenses.clear();
                        System.out.println(expenses+"\n");
                        System.out.println("All your expenses are erased!\n");
                    } else {
                        System.out.println("Oops... try again!");
                    }
                    Selection();
                    break;
                case 4:
                    sortExpenses(expenses);
                    Selection();
                    break;
                case 5:
                    searchExpenses(expenses);
                    Selection();
                    break;
                case 6:
                    closeApp();
                    break;
                default:
                    System.out.println("You have made an invalid choice!");
                    break;
            }
        }
    }

}
private static void closeApp() {
    System.out.println("Closing your application... \nThank you!");
        }
private static void searchExpenses(ArrayList<Integer> arrayList) {
    int length = arrayList.size();
    int search;
    System.out.println("Enter the expense you need to search:\t");
     Scanner sc = new Scanner(System.in);
    search = sc.nextInt();
     boolean ans = arrayList.contains(search);

    if (ans)
        System.out.println("The expenditure is available in the array list");
    else
        System.out.println("The expenditure is no available in the array list");
 
}
private static void sortExpenses(ArrayList<Integer> arrayList) {
    int arrlength =  arrayList.size();
    System.out.println("The lis of array Before Sorting:");  
for(int marks: arrayList)  
{  
System.out.println(marks);  
}  
Collections.sort(arrayList);
    System.out.println(arrayList);

}
}

