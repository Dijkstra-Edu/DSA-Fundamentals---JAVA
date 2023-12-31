
class StringBuilder_exp {
    public static void main(String[] args) {
        int n = 10000;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("hello");
        }
        String s = str.toString();
    }
}

//If you have to concatenate strings often,
// it will be better to use some other data structures 
//like StringBuilder. The below code runs in O(n) complexity.

//Normal methods to concatenate is O(n^2), so beware

/*
 * Other String BUilder Functions:
 * append()
 * delete()
 */

/*
1) String To Integer: int i=Integer.parseInt("200");  
                      Integer i=Integer.valueOf(s);  //Coverts into Integer object, NOT int

2) Integer to String: String.valueOf(i);
                      Integer.toString(i);

3) for (char ch: "xyz".toCharArray()) {} NOT for( char ch : "xyz"){}

4) char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Simple Way to Create Char Array
   char[] number = "0123456789".toCharArray(); 

Note: setLength(0) - way to clear String Builder, no clear() function 

5) String Functions:
charAt()	- Returns the character at the specified index (position) - char
compareTo() - Compares two strings lexicographically - int
compareToIgnoreCase() - Compares two strings lexicographically, ignoring case differences - int
concat() - Appends a string to the end of another string - String
contains() - Checks whether a string contains a sequence of characters - boolean
contentEquals() - Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer - boolean
copyValueOf() - Returns a String that represents the characters of the character array - String
endsWith() - Checks whether a string ends with the specified character(s) - boolean
equals() - Compares two strings. Returns true if the strings are equal, and false if not - boolean
equalsIgnoreCase() - Compares two strings, ignoring case considerations - boolean
format() - Returns a formatted string using the specified locale, format string, and arguments - String
getChars() - Copies characters from a string to an array of chars - void
indexOf() - Returns the position of the first found occurrence of specified characters in a string - int
isEmpty() - Checks whether a string is empty or not - boolean
lastIndexOf() - Returns the position of the last found occurrence of specified characters in a string - int
length() - Returns the length of a specified string - int
matches() - Searches a string for a match against a regular expression, and returns the matches - boolean
replace() - Searches a string for a specified value, and returns a new string where the specified values are replaced - String
replaceFirst() - Replaces the first occurrence of a substring that matches the given regular expression with the given replacement - String
replaceAll() - Replaces each substring of this string that matches the given regular expression with the given replacement - String
split() - Splits a string into an array of substrings - String[]
startsWith() - Checks whether a string starts with specified characters - boolean
substring() - Returns a new string which is the substring of a specified string - String
toCharArray() - Converts this string to a new character array - char[]
toLowerCase() - Converts a string to lower case letters - String
toString() - Returns the value of a String object - String
toUpperCase() - Converts a string to upper case letters - String
trim() - Removes whitespace from both ends of a string - String
valueOf() - Returns the string representation of the specified value - String
 */

