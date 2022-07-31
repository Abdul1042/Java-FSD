
public class Assisted_Practice3 {

	public int Addition(int a,int b) 
	{
		int add = a+b;
		return add;
	}
	public static void main(String[] args) {
		Assisted_Practice3 c= new Assisted_Practice3();
		int Answer= c.Addition(50,50);
		System.out.println("The Values are: ");
		System.out.println("Addition is :"+Answer);
		}
	
	
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	
		callMethod d = new callMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
	}

}
