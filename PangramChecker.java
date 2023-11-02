public class PangramChecker {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);
        System.out.println("Is it a pangram? " + isPangram);
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}
