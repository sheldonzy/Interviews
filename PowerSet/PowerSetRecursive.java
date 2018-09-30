import java.util.ArrayList;

public class PowerSetRecursive {

    static ArrayList<ArrayList<Integer>> getSubsets_Recursive(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> all_subsets;

        //Base case - add empty set
        if (set.size() == index)
        {
            all_subsets = new ArrayList<>();
            all_subsets.add(new ArrayList<>()); // Empty set
        }
        else
        {
            all_subsets = getSubsets_Recursive(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> all_current_subsets = new ArrayList<>();
            for (ArrayList<Integer> subset : all_subsets) {
                ArrayList<Integer> current_subset = new ArrayList<>(subset);
                current_subset.add(item);
                all_current_subsets.add(current_subset);
            }
            all_subsets.addAll(all_current_subsets);
        }
        return all_subsets;
    }

    public static void main(String args[]) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            set.add(i);
        }
        System.out.println(getSubsets_Recursive(set, 0));

    }
}
