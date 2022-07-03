//package class3;

//public class DeletedSoAllTheCodes {

// HomeWork #3
// question 1 -----------------------------------------------------------------

package homework.three;

public class QuestionOne {

	public static void main(String[] args) {
    int [] numbers = {23, 423, 12, 598, 200, 112};
    int sum =0;
    for (int a= 0; a< numbers.length;a++) {
    	sum = sum +numbers[a];
    	
    	System.out.println("Sum of the array =" + sum);
    }
    
	}

}


//Question 2 -----------------------------------------------------------------------

package homework.three;

public class QuestionTwo {
		public static void main(String[] args) {
			double[] numbers;
			numbers = new double[9];

			String[] PokerPlayers;

			for(int a =0; a<numbers.length; a++) {
				System.out.println(numbers[a]);
			}

		}

	}

	
// Question 3 --------------------------------------------------------- whats whong here?

package homework.three;

public class QuestionThree {

	public static void main(String[] args) {
		int[] numbers = {23, 423, 12, 598, 200, 112};
		
		//int find = 0;
	   // find = find + numbers[200];
		
		int find = 200;
	    
		for (int i = 0; <numbers.length ; i++) {
			
	
		System.out.println(find + "its there");}
		}
}

//Question 4 -------------------------------------------------------------------------------

package homework.three;

public class QuestionFour {

	public static void main(String[] args) {
        int[] array2 = { 61, 17, 58, 39, 10  };
 
        int length = array2.length;
 
        int sum = 0;
        
        for (int i = 0; i < array2.length; i++) {
           // sum += array2[i];
            sum = sum + array2 [i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
 
}

// Question 5--------------------------------------------------------- Did not get the result

package homework.three;

public class QuestionFive {

	public static void main(String[] args) {
		 int [] numbers = { 61, 17, 58, 39, 10 };
		 int max = numbers.stream(numbers).max().getAsInt();
		    System.out.println("Largest Element is: " + max);
		 
}
}














