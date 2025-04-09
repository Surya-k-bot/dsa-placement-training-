import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    char ch = Scanner.next().charAt(0);
    if((ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') || (ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u'))
    {
        System.out.println("Vowel");
    }
           
    else 
    {
        System.out.println("Consonant");
    }

}
}
