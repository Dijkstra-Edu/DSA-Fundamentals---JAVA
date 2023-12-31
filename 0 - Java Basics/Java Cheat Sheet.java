import java.util.*;

class JavaCheatSheet {

    // Function to Return Unique elements from Array(arraylist)
    public static ArrayList<Integer> unique(ArrayList<Integer> arr) {
        ArrayList<Integer> uq = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (uq.contains(arr.get(i))) {
                continue;
            } else {
                uq.add(arr.get(i));
            }
        }
        return uq;
    }

    // Function to Reverse a Number: Eg: 160 = 061
    public static int reverse(int x) {
        int number = x, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // Simple Way to Create Char Array
    char[] number = "0123456789".toCharArray();

    public static String reverse(String str) { // Two pointer technique
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] characters = str.toCharArray();
        int i = 0;
        int j = characters.length - 1;
        while (i < j) {
            swap(characters, i, j);
            i++;
            j--;
        }
        return new String(characters);
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public int length(String s) {
        int ans = 0;
        for (char x : s.toCharArray()) {
            ans++;
        }
        return ans;
    }

    generatePermutation(str, 0, len, x);  
    //Function to get all permutations of a string
    //Eg: 123 -> 123, 231, 321...
    public static void generatePermutation(String str, int start, int end, List<String> ans) {
        if (start == end - 1)
        {
            ans.add(str);
        }
            
        else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i); 
                generatePermutation(str, start + 1, end, ans); 
                str = swapString(str, start, i);
            }
        }
    }
    
    private static String swapString(String stri, int i, int j) {
        char[] str = stri.toCharArray();
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        return String.valueOf(str);
    }

    // Function to get all combinatinations of a string
    //Eg: 12345 - 1, 12, 123, 1234, 12345...
    public static String[] AllPossibleSubsets(String st)
    {
        String str = st;  
        int len = str.length();  
        int temp = 0;  
        //Total possible subsets for string of size n is n*(n+1)/2  
        String arr[] = new String[len*(len+1)/2];  
  
        //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
        return arr;
    }

    //Also check: https://www.geeksforgeeks.org/print-all-substring-of-a-number-without-any-conversion/
    // https://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/

    static void printSubArrays(int[] arr, int start, int end) //Time: O(2^n)
    {
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;
        // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1);
        // Print the subarray and increment the starting
        // point
        else {
            System.out.print("[");
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printSubArrays(arr, start + 1, end);
        }
        return;
    }

    printSubArrays(nums, 0, 0);

    public void printSubArrays(int[] arr, int start, int end, int k2) //Time: O(n^3)
    {
        int n = arr.length;
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                int sum = 0;
                for (int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                }
                if(sum%k2==0)
                {
                    count++;
                }
            }
        }
    }
}
