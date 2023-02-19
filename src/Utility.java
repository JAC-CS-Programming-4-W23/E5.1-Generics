import java.util.function.Function;
import java.util.function.Predicate;

public class Utility {

    private Utility() {}

    /**
     * Swap elements at i and j in the input array.
     * @param array The array to use for swapping.
     * @param i The first index.
     * @param j The second index.
     */
    public static <T> void swap(T[] array, int i, int j) {
        T holder = array[j];
        array[j] = array[i];
        array[i] = holder;
    }

    /**
     * Count the number of occurrences of an element inside an array.
     * @param array The array to use for counting.
     * @param element The element to check for inside the array.
     * @return The number of occurrences of the element inside the array.
     */
    public static <T> int count(T[] array, T element) {
        int count = 0;

        // can allow counting of null references
        // why though?
        if (element == null) {
            for (T listItem : array) {
                if (listItem == null) {
                    count++;
                }
            }
        }
        else {
            for (T listItem : array) {
                if (element.equals(listItem)) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Find the first occurrence of the given element in the array.
     * @param array The array in which we want to look.
     * @param element The element we want to look for in the array.
     * @return The index of the element in the array. -1 if not found.
     */
    public static <T> int find(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Remove all occurrences of element from the given array.
     * @param array The array we want to filter.
     * @param size The length of the given array.
     * @param element The element we want to filter in the array.
     * @return The size of the array minus any removals.
     */
    public static <T> int filter(T[] array, int size, T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }

                array[size - 1] = null; // TODO: explain when we cover references
                size--;
                i--;
            }
        }

        return size;
    }

    public static <T> int filterWith(T[] array, int size, Predicate<T> p) {
        for (int i = 0; i < size; i++) {
            if (p.test(array[i])) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }

                array[size - 1] = null; // TODO: explain when we cover references
                size--;
                i--;
            }
        }

        return size;
    }

    private static <T> Pair<T>[] zipPair(T[] array1, T[] array2) {
        // the input arrays must be the same length
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("The two input arrays must have the same length");
        }

        // "zip" together the two input arrays into the resulting array.
        Pair<T>[] zippedArray = (Pair<T>[]) new Pair[array1.length];

        for (int i = 0; i < array1.length; i++) {
            zippedArray[i] = new Pair<>(array1[i], array2[i]);
        }

        return zippedArray;
    }

    private static <S,T> Tuple<S,T>[] zipTuple(S[] array1, T[] array2) {
        // the input arrays must be the same length
        if (array1.length != array2.length)
            throw new IllegalArgumentException("The two input arrays must have the same length");

        // "zip" together the two input arrays into the resulting array.
        Tuple<S, T>[] zippedArray = (Tuple<S,T>[]) new Tuple[array1.length];

        for (int i = 0; i < array1.length; i++) {
            zippedArray[i] = new Tuple<>(array1[i], array2[i]);
        }

        return zippedArray;
    }

    public static <R, S, T> R[] zipWith(S[] array1, T[] array2, Function<Tuple<S, T>, R> f) {
        // the input arrays must be the same length
        if(array1.length != array2.length) {
            throw new IllegalArgumentException("The two input arrays must have the same length");
        }

        // "zip" together the two input arrays into the resulting array.
        R[] zippedArray = (R[]) new Object[array1.length];

        for (int i = 0; i < array1.length; i++) {
            zippedArray[i] = f.apply(new Tuple<>(array1[i], array2[i]));
        }

        return zippedArray;
    }

    public static <S, T> S[] map(T[] array, Function<T, S> f) {
        S[] result = (S[]) new Object[array.length];

        for(int i = 0; i < array.length; i++) {
            result[i] = f.apply(array[i]);
        }

        return result;
    }

}
