package week04;

public class Week04CodingProject {
	
	public static void main(String[] args) {	//PART 1 - 6 MAIN BODY
	//PART 1
	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	System.out.println("The age range is " + (ages[ages.length - 1] - ages[0]));
	System.out.println("The age2 range is " + (ages2[ages2.length - 1] - ages2[0]));

	/*No matter what, index 0 will always be the first element in the array and if you do the full 
	length of the array -1 then it will always be the last element of the array, and you have to 
	subtract 1 because arrays start at 0 and count up.*/

	int ageSum = 0;
	for (int i = 0; i < ages.length; i++) {
	ageSum += ages[i];
	}
	System.out.println("The average age is " + (double)ageSum / ages.length);
	

	//PART 2
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int sumLetters = 0;
	for (int i = 0; i < names.length; i++) {
	sumLetters += names[i].length();
	}
	double averageLetters = (double)sumLetters / names.length;
	System.out.println("The average amount of letters in each name is " + averageLetters);

	String concat = "";
	for (int i = 0; i < names.length; i++) {
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
	for (int i = 0; i < nameLengths.length; i++) {
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
/*
	//PART 8
	Public String name(String firstName, String lastName) {
	System.out.println(firstName + “ “ + lastName);
	}

	//PART 9
	Public boolean sum(int[] array) {
	int sum = 0;
	for (int i = 0; i < array.length; i++) {
	sum = array[i] + sum;
	}
	return (sum > 100);
	}

	//PART 10
	Public double avgElements(double[] array) {
	double sum = 0;
	for (int I = 0; i < array.length; i++) {
	sum = array[i]  + sum;
	}
	Return (sum / array.length);

	//PART 11
	Public Boolean compAvg(double[] firstArray, double[] secondArray) {
	double sum = 0;
	double avgElements;
	for (int I = 0; i < firstArray.length; i++) {
	sum = firstArray[i]  + sum;
	}
	avgElements = sum / firstArray.length;

	double sum2 = 0;
	double avgElements2;
	for (int I = 0; i < secondArray.length; i++) {
	sum2 = secondArray[i]  + sum2;
	}
	avgElements2 = sum2 / secondArray.length;

	return (avgElements > avgElements2);
	}
	//PART 12
	Public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return (isHotOutside && (moneyInPocket > 10.50));

	//PART 13
	Public Boolean alarmClock(double currentTime, int exhaustion, int levelOfCare) {
	return ((timeToWakeUp >= currentTime) && (exhaustion <= 6) && (levelOfCare >=4));


	/*Exhaustion will be 1 – 10
	TimeToWakeUp will be > or == to desired wake up time
	levelOfCare will also be on a 1 – 10 scale based on user input.
	This method helps determine if the user should turn their alarm clock off and wake up and get ready for their day. It will return true if they should turn it off and start their day, it will return false if they shouldn’t and should just go back to sleep.
	I created it because I had somebody tell me what a problem of theirs was and this is what they told me so this is what I made a method for.
	*/
	
}
