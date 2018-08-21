import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] ar = new int[] {0,0,0,1,3,3,2,1,3,5,6,0};

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for(int current : ar) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            output.add(current);
        }

        FrequencyComparator comp = new FrequencyComparator(map);
        Collections.sort(output, comp);
        for(Integer i : output){
            System.out.print(i + " ");
        }
    }
}