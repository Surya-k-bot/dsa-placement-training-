public class Main {
    public static void main(String[] args) {
        String s = "bac";
        char[] chars = s.toCharArray();
         for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        String sortedString = new String(chars);
        System.out.println(sortedString);
    }
}
