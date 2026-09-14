public class StringMatchBrute {

    public static void main(String[] args) {
        String s1= "keshav sharma  is a holy shit in this world";
        String s2 = "sharma";
        BruteForce(s1, s2);
    }

    public static void BruteForce(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;
            while (j < pattern.length() && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at index " + i);
                return;
            }
        }
        System.out.println("Pattern not found");
    }
}
