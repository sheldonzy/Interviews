import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSetRecursiveV2Tree {

    private static void getSubsets_Recursive_Tree(ArrayList<Integer> set, List<Integer> current_set, ArrayList<List<Integer>> target_set, int index){
        if(index == set.size()){
            List<Integer> new_current_set = new ArrayList<>(current_set);
            target_set.add(new_current_set);
        }
        else{
            current_set.set(index, null);
            getSubsets_Recursive_Tree(set, current_set, target_set, index + 1);
            current_set.set(index, set.get(index));
            getSubsets_Recursive_Tree(set, current_set, target_set, index + 1);
        }
    }


    public static void main(String args[]) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            set.add(i);
        }
        ArrayList<List<Integer>> target_set = new  ArrayList<List<Integer>>();
        getSubsets_Recursive_Tree(set, Arrays.asList(new Integer[3]), target_set, 0);
        System.out.println(target_set);
    }
}
