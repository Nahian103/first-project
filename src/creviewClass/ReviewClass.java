package creviewClass;

public class ReviewClass {

		public static void main(String args[]){
		      int temp, size;
		      int array[] = {11,2,5,36,21,89,12};
		      size = array.length;

		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){
		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		      System.out.println("Smallest number is "+array[0]);
		  
	}

}
