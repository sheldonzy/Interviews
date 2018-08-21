public class PrintAllStringPermutations {

    public static void main(String[] args){
        PrintPerm("abcd", "");
    }

    private static void PrintPerm(String word, String perm){
        if(word.isEmpty()){
            System.out.println(perm);
        }
        for(int i = 0; i < word.length(); i++){
            PrintPerm(word.substring(0, i) + word.substring(i + 1, word.length()), perm + word.charAt(i));
        }
    }
}
