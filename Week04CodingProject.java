 
package week04;

public class Week04CodingProject {
	
	public static void main(String[] args) {	//PART 1 - 6 MAIN BODY
	//PART 1
	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};//array with 8 elements
	int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};//array with 9 elements thats longer than the ages array.

	System.out.println("The age range is " + (ages[ages.length - 1] - ages[0]));
	System.out.println("The age2 range is " + (ages2[ages2.length - 1] - ages2[0]));

	int ageSum = 0;
	for (int i = 0; i < ages.length; i++) {
	ageSum += ages[i];//iterates through the array adding each index to "ageSum"
	}
	System.out.println("The average age is " + (double)ageSum / ages.length);//formula for calculating averages
	

	//PART 2
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int sumLetters = 0;
	for (int i = 0; i < names.length; i++) {
	sumLetters += names[i].length();
	}
	double averageLetters = (double)sumLetters / names.length;
	System.out.println("The average amount of letters in each name is " + averageLetters);

	String concat = "";//Initialized with just quotes so that it's "empty".
	for (int i = 0; i < names.length; i++) {//for loop iterates through indexes concatenating all of them separated with a space.
	concat += names[i] + " ";
	}
	System.out.println(concat.trim());	//.trim()removes extra space at the end
	
	//PART 3
	//lastElement = arrayName.length - 1
	
	//PART 4
	//firstElement = arrayName[0];
	
	//PART 5
	int[] nameLengths = new int[names.length];
	
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	}
	
	//PART 6
	int nameLengthSum = 0;
	for (int i = 0; i < nameLengths.length; i++) {//gives the total amount of letters
	nameLengthSum += nameLengths[i];
	}
	System.out.println("The sum of all the names is " + nameLengthSum);
	
	}//END MAIN BODY
	
	//PART 7
	public static String concat(String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
	}
	return result.toString();
}
	//PART 8
	public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
	}

	//PART 9
	public static boolean sumIntsGreaterThan100(int[] array) {
	int sumInts = 0;
	for (int i = 0; i < array.length; i++) {//adds all array indexes to sumInts
	sumInts += array[i];
	}
	return sumInts > 100;//if the total sum is > 100 it returns true
	}

	//PART 10
	public static double avgElements(double[] array) {
	double sumElements = 0;
	for (int i = 0; i < array.length; i++) {
	sumElements += array[i];
	}
	return sumElements / array.length;
	}

	//PART 11
	public static Boolean compAvg(double[] firstArray, double[] secondArray) {
	double sum1 = 0, sum2 = 0;
	
	for (int i = 0; i < firstArray.length; i++) {//iterates through array1 adding every index to sum1
	sum1 += firstArray[i];
	}
	for (int i = 0; i < secondArray.length; i++) {//iterates through array2 adding every index to sum2
	sum2 += secondArray[i];
	}
	
	double avgElements1 = sum1 / firstArray.length;
	double avgElements2 = sum2 / secondArray.length;

	return avgElements1 > avgElements2;//outputs true if avgE1 is greater than avgE2
	}
	
	//PART 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50;
	}

	//PART 13
	public static Boolean alarmClock(int currentTime, int exhaustion, int levelOfCare) {
		return currentTime >= 700 && exhaustion <= 6 && levelOfCare >=4;
	}

	//PART 13 METHOD EXPLAINED:
	/*Exhaustion will be 1 – 10
	TimeToWakeUp will be > or == to desired wake up time, functioning as a 24 hour clock
	levelOfCare will also be on a 1 – 10 scale based on user input.
	This method helps determine if the user should turn their alarm clock off and wake up and get ready for their day. It will return true if they should turn it off and start their day, it will return false if they shouldn’t and should just go back to sleep.
	I created it because I had somebody tell me what a problem of theirs was and this is what they told me so this is what I made a method for.
	*/
	
}
