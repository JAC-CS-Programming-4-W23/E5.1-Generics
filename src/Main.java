import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] integerArray = { 3, 4, 7, 5, 6, 7, 4, 5, 6, 7, 9, 0, 7, 6, 5, 9 };
        Pair<Integer>[] pairArray = new Pair[] {new Pair<>("asd", 4), new Pair<>(1, 2) };

        System.out.println("Original Array: " + Arrays.toString(pairArray));

        Utility.swap(pairArray, 0, pairArray.length - 1);

        System.out.println("\nSwapped Array: " + Arrays.toString(pairArray));

        int count = Utility.count(pairArray, 4);
        int nullCount = Utility.count(pairArray, null);

        System.out.println("\nCount (4): " + count);
        System.out.println("Null Count: " + nullCount);

        int foundIndex = Utility.find(pairArray, 7);
        int notFoundIndex = Utility.find(pairArray, 42);

        System.out.println("\nFound Index (7): " + foundIndex);
        System.out.println("Not Found Index (42): " + notFoundIndex);

        int filteredSize = Utility.filter(pairArray, pairArray.length, 4);

        System.out.println("\nFiltered Array (4): " + Arrays.toString(pairArray));
        System.out.println("Number of elements removed: " + filteredSize);

//        String[] s = Utility.map(array, (x) -> "hello " + x);

//        System.out.println(Arrays.toString(s));

//        System.out.println(Arrays.toString(array));

//        int size = array.length;
//        size = Utility.filter(array, size, 4);
//        System.out.println(Arrays.toString(array));
//
//        size = Utility.filterWith(array, size, (x) -> x % 2 == 1);
//        System.out.println(Arrays.toString(array));
    }

}
