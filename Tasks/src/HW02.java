import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;

public class HW02 {
	
	public static void main(String[] args) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
		getSumOfNumbers("5 dsads,asdsa,10,55");
		
		String[] testArrayList= {"a", " c", "b"};
		sortIgnoringSpaces(testArrayList);
		
    }
	
	// Task 01
	public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
		
		Pattern pattern = Pattern.compile("[^0-9]");
	    Matcher matcher = pattern.matcher(s);
	    String result = matcher.replaceAll(",");
		
		String[] numbersArray = result.split(",");
		
		int sum = 0;
		for(String i : numbersArray){	
			if(i!=null && i.length()>0 ){
				sum = sum + Integer.parseInt(i);	
			}	
		}
		
		return sum;
    }
	
	// Task 02
	public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */

		Arrays.sort(a, new Comparator<String>() {
			public int compare(String str1, String str2) {
				return str1.trim().compareTo(str2.trim());                                 /* Integer.compare(o1, o2); */
			}
		});
		
	}

}
