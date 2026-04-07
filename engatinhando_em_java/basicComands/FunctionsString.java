package basicComands;

public class FunctionsString {
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-"); 
		System.out.println("toLowerCase: -" + s01 + "-"); // convert all characters to lowercase
		System.out.println("toUpperCase: -" + s02 + "-"); // convert all characters to uppercase
		System.out.println("trim: -" + s03 + "-"); // remove leading and trailing whitespace
		System.out.println("substring((2): -" + s04 + "-"); // extract substring starting from index 2
		System.out.println("Substring(2, 9): -" + s05 + "-"); // extract substring from index 2 to index 9 (exclusive)
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // replace all occurrences of 'a' with 'x'
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // replace all occurrences of "abc" with "xy"
		System.out.println("Index of 'bc': " + i); // find the index of the first occurrence of "bc"
		System.out.println("Last index of 'bc': " + j); // find the index of the last occurrence of "bc"
		
		
	}
}
