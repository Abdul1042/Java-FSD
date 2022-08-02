
public class Longest_Increasing {
	
	   public static void main(String args[]){
	      int array[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80 ,90 };
	      int array_len = array.length;
	      System.out.println("The length of the longest increasing subsequence is " +  LIS(array, array_len));
	   }
	   static int LIS(int array[], int len_array){
		      int seq_array[] = new int[len_array];
		      int i, j, last = 0;
		      for (i = 0; i < len_array; i++)
		         seq_array[i] = 1;
		      for (i = 1; i < len_array; i++)
		      for (j = 0; j < i; j++)
		      if (array[i] > array[j] && seq_array[i] < seq_array[j] + 1)
		      seq_array[i] = seq_array[j] + 1;
		      for (i = 0; i < len_array; i++)
		      if (last < seq_array[i])
		      last = seq_array[i];
		      return last;
		   }
}
