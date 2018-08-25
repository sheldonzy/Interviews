import java.util.Arrays;

public class MaximizeNumberWithKAdjacentSwaps {
    public static void main(String[] args){
        int[] input1 = new int[] {1, 2, 4, 3};
        int numberOfSwaps = 2;
        Maximize(input1, numberOfSwaps);
        System.out.println(Arrays.toString(input1));

    }

    private static void Maximize(int[] arr, int swapsAllowed)
    {
        int startIndex = 0;
        int lastIndex = swapsAllowed + startIndex < arr.length - 1 ? swapsAllowed + startIndex : arr.length - 1;

        while (swapsAllowed > 0 && startIndex < arr.length)
        {
            int maxIndex = getMaxIndex(arr, startIndex, lastIndex);
            if (maxIndex > startIndex)
            {
                for (int i = maxIndex; i >= startIndex + 1; i--)
                {
                    swap(arr, i, i - 1);
                }
            }

            swapsAllowed = swapsAllowed - (maxIndex - startIndex);
            startIndex++;
            lastIndex = swapsAllowed + startIndex < arr.length - 1 ? swapsAllowed + startIndex : arr.length - 1;
        }
    }

    private static int getMaxIndex(int arr[], int startIndex, int endIndex){
        int maxIndex = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            maxIndex = arr[i] > arr[maxIndex] ? i : maxIndex;
        }
        return maxIndex;
    }

    private static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}


