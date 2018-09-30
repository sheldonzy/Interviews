import java.util.ArrayList;

public class PowerSetIterative {

    private static ArrayList<ArrayList<Integer>> getSubsets_Iterative(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> all_subsets = new ArrayList<>();
        int max = 1 << set.size(); /* Compute 2^An */
        for (int k = 0; k < max; k++) {
            ArrayList<Integer> subset = convertintToSet(set, k);
            all_subsets.add(subset);
        }
        return all_subsets;
    }

    private static ArrayList<Integer> convertintToSet(ArrayList<Integer> set, int x) {
        ArrayList<Integer> subset = new ArrayList<>();
        int index = 0;
        for (int k = x; k > 0; k >>= 1) {
            if ((k & 1) == 1) {
                subset.add(set.get(index));
            }
            index++;
        }
        return subset;
    }

    public static void main(String args[]) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            set.add(i);
        }

        System.out.println(getSubsets_Iterative(set));
    }

}
