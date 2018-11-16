package com.company;

public class NonEmptyIntList implements IntList{
    private int element;
    private IntList queue;

    public NonEmptyIntList(int element, IntList queue) {
        this.element = element;
        this.queue = queue;
    }

    public int getElement() {
        return element;
    }

    public IntList getQueue() {
        return queue;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntList cons(int n) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }
}
