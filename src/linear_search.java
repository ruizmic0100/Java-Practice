public class linear_search {
    public static void main(String args[]) {
        /* Linear Search = Iterate through a collection one element at a time.
                           
                           runtime complexity: O(n) 'linear time'

                           Disadvantages: Slow for large data sets

                           Advantages: Fast for searches of small to medium data sets
                           Does not need to be sorted
                           Useful for data structures that do not have random access (linked list)
         */
        int[] array = {9, 2, 3, 4, 5, 1, 10, 12, 23};

        long startTime = System.nanoTime();
        int index = linearSearch(array, 1);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        if (index != -1) {
            System.out.println("Element found at index: " + index);
            System.out.println("Time it took: " + elapsedTime + "ns");
        } else {
            System.out.println("Element not found");
            System.out.println("Time it took: " + elapsedTime + "ns");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i=0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
