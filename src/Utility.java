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

    }

    /**
     * Count the number of occurrences of an element inside an array.
     * @param array The array to use for counting.
     * @param element The element to check for inside the array.
     * @return The number of occurrences of the element inside the array.
     */
    public static <T> int count(T[] array, T element) {

    }

    /**
     * Find the first occurrence of the given element in the array.
     * @param array The array in which we want to look.
     * @param element The element we want to look for in the array.
     * @return The index of the element in the array. -1 if not found.
     */
    public static <T> int find(T[] array, T element) {

    }

    /**
     * Remove all occurrences of element from the given array.
     * @param array The array we want to filter.
     * @param size The length of the given array.
     * @param element The element we want to filter in the array.
     * @return The size of the array minus any removals.
     */
    public static <T> int filter(T[] array, int size, T element) {

    }

    public static <T> int filterWith(T[] array, int size, Predicate<T> p) {

    }

    private static <T> Pair<T>[] zipPair(T[] array1, T[] array2) {

    }

    private static <S,T> Tuple<S,T>[] zipTuple(S[] array1, T[] array2) {

    }

    public static <R, S, T> R[] zipWith(S[] array1, T[] array2, Function<Tuple<S, T>, R> f) {

    }

    public static <S, T> S[] map(T[] array, Function<T, S> f) {
        
    }

}
