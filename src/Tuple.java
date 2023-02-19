/**
 * Generic heterogeneous tuple class
 * @author Ian Clement (ian.clement@johnabbott.qc.ca)
 */
public class Tuple<S, T> {

    private S first;
    private T second;

    public Tuple(S fst, T snd) {
        this.first = fst;
        this.second = snd;
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first.toString() + ", " + second.toString() + ")";
    }

}
