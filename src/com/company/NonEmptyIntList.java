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
        return new NonEmptyIntList(n, this);
    }

    @Override
    public int length() {
       return 1 + queue.length();
    }

    @Override
    public String toString(){
        return this.element +  queue.toString();
    }

    @Override
    public void addInt(int n) {
        this.element += n;
        queue.addInt(n);
    }

    @Override
    public IntList concat(IntList list) {

    }
}
