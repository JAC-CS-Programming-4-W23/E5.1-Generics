/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

/**
 * Generic homogeneous pair class
 * @author Ian Clement (ian.clement@johnabbott.qc.ca)
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
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
