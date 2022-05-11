package _00_Intro_to_Sorting_Algorithms;

import java.awt.Color;
import java.util.Random;

public class _00_SortingDemo {
    public static void (String[] args) {
        /*
         * Bubble Sort is a simple sorting algorithm that uses 2 for loops over
         * a data structure.
         * 
         * The inner for loop continually compares one element to the next and
         * swaps the values until a single element is in its correctly ordered
         * position.
         * 
         * The outer for loop runs the inner for loop for the number of
         * elements in the data structure. So if an array has 5 elements, the
         * outer for loop runs 5 times and all 5 elements are in their
         * correctly ordered position. 
         */
        
        /*
         * Sorting an array of numbers from lowest to highest (Ascending order)
         * 1, 2, 3, 4, 5, 6, ...
         */
       for (int i = 0; i < args.length; i++) {
		
	}
    	int[] arr = { 6, 2, 4, 5, 1, 3 };
        
        // This for loop puts every value in the correct position
        for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                
                // If the current element is bigger than the next...
                if( arr[k] > arr[ k+1 ] ) {
                    
                    // Swap elements at k and k+1
                    int temp = arr[k];
                    arr[k] = arr[ k+1 ];
                    arr[ k+1 ] = temp;
                }
            }
        }
        
        for( int i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an array of numbers from highest to lowest (Descending order)
         * 6, 5, 4, 3, 2, 1, ...
         */
        int[] arr2 = { 6, 2, 4, 5, 1, 3 };
        
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2.length - 1; k++) {
                
                // The only difference is the > changes to <
                if( arr2[k] < arr2[ k+1 ] ) {
                    int temp = arr2[k];
                    arr2[k] = arr2[ k+1 ];
                    arr2[ k+1 ] = temp;
                }
            }
        }
        
        for( int i : arr2 ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an array of Strings alphabetically (or lexicographically)
         * from A to Z.
         * "a", "b", "c", "d", ...
         */
        String[] arr3 = { "c", "e", "d", "f", "b", "a" };
        
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3.length - 1; k++) {
                
                // "a".compareTo( "b" ) => -1
                // "b".compareTo( "a" ) => 1
                // "b".compareTo( "b" ) => 0
                if( arr3[k].compareTo(arr3[ k+1 ]) > 0 ) {
                    String temp = arr3[k];
                    arr3[k] = arr3[ k+1 ];
                    arr3[ k+1 ] = temp;
                }
            }
        }
        public static void main(String[] args)
    	{	String s1 = "Computer Science";
    		int x = 307;
    		String s2 = s1 + " " + x;
    		String s3 = s2.substring(10,17);
    		String s4 = "is fun";
    		String s5 = s2 + s4;
    		
    		System.out.println("s1: " + s1);
    		System.out.println("s2: " + s2);
    		System.out.println("s3: " + s3);
    		System.out.println("s4: " + s4);
    		System.out.println("s5: " + s5);
    		
    		//showing effect of precedence
    		
    		x = 3;
    		int y = 5;
    		String s6 = x + y + "total";
    		String s7 = "total " + x + y;
    		String s8 = " " + x + y + "total";
    		System.out.println("s6: " + s6);
    		System.out.println("s7: " + s7);
    		System.out.println("s8: " + s8);
    	}

		Color[][] result = new Color[image.length][image[0].length];

		for(int row = 0; row < image.length; row++)
		{	for(int col = 0; col < image[0].length; col++)
			{	result[row][col] = aveOfNeighbors(image, row, col, neighberhoodSize);
			}
		}

		return result;
        
        for( String i : arr3 ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < 18) { // length of the random string.
        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;

}
