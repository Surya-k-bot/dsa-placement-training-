import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.nextLine(); 
        char[] ch = name.toCharArray();
        int len = name.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (ch[i] != ch[len - i - 1]) {
                isPalindrome = false; 
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close(); 
    }
}
