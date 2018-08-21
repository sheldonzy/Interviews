public class PrintAllStringCombinations {

    public static void main(String[] args){
        printAllStringCombinations("abcd", new StringBuilder(), 0);
    }

    private static void printAllStringCombinations(String word, StringBuilder sb, int index)
    {
        for (int i = index; i < word.length(); i++)
        {
            sb.append(word.charAt(i));
            System.out.println(sb);
            printAllStringCombinations(word, sb, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
