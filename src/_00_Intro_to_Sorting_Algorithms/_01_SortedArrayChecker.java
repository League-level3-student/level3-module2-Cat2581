package _00_Intro_to_Sorting_Algorithms;

import java.util.Random;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
	Random rand = new Random(); int value = rand. nextInt(50);
	
	public static boolean intArraySorted(int[] arr) {
        
        return false;
    }

    int length = 10;
    boolean useLetters = true;
    boolean useNumbers = false;

    System.out.println("true");
    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();

    System.out.println(generatedString);

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    int leftLimit1 = 97; // letter 'a'
    int rightLimit1 = 122; // letter 'z'
    int targetStringLength1 = 10;
    Random random1 = new Random();

    String generatedString1 = random.ints(leftLimit, rightLimit + 1)
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();

    System.out.println(generatedString);

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    int leftLimit2 = 48; // numeral '0'
    int rightLimit2 = 122; // letter 'z'
    int targetStringLength2 = 10;
    Random random2 = new Random();

    String generatedString2 = random.ints(leftLimit, rightLimit + 1)
      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();

    System.out.println(generatedString);
}


String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
StringBuilder salt = new StringBuilder();
Random rnd = new Random();
while (salt.length() < 18) { // length of the random string.
    int index = (int) (rnd.nextFloat() * SALTCHARS.length());
    salt.append(SALTCHARS.charAt(index));
}
String saltStr = salt.toString();
return saltStr;
