
public class Practice_Problem1 {
	public int add(int a, int b)
	{
		int addition=0;
		addition=a+b;
		return addition;
	}
	public int sub(int a, int b){
		int subraction;
		subraction=a-b;
		return subraction;
	}
	public int mult(int a, int b){
		int multiplication;
		multiplication=a*b;
		return multiplication;
	}
	public int div(int a, int b){
		int division;
		division=a/b;
		return division;
	}
	

	public static void main(String[] args) {
		Practice_Problem1 c= new Practice_Problem1();
		int w=c.add(10,20);
		int x=c.sub(20,10);
		int y=c.mult(5,2);
		int z=c.div(10,2);
		
	System.out.println("Addition :"+w);
	System.out.println("Subraction :"+x);
	System.out.println("Multiplication :"+y);
	System.out.println("Division :"+z);

	}

}
