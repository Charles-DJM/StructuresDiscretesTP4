package com.company;

import javax.crypto.ExemptionMechanism;

public class NonEmptyIntList implements IntList{
    private int element;
    private IntList tail;

    public NonEmptyIntList(int element, IntList tail) {
        this.element = element;
        this.tail = tail;
    }

    public int getElement() {
        return element;
    }

    public IntList getTail() {
        return tail;
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
       return 1 + tail.length();
    }

    @Override
    public String toString(){
        return this.element +  tail.toString();
    }

    @Override
    public void addInt(int n) {
        this.element += n;
        tail.addInt(n);
    }

    @Override
    public IntList concat(IntList list) {
        return new NonEmptyIntList(this.element, this.tail.concat(list));
    }

    @Override
    public IntList clone(){
        if(tail.isEmpty()){
            return new NonEmptyIntList(this.element, new EmptyIntList());
        }

        else{
            IntList newList = tail.clone();
            return new NonEmptyIntList(this.element, newList);
        }
    }

    @Override
    public boolean equals(IntList list){
        if(!list.isEmpty()){
            return (this.element == list.getElement()) && this.tail.equals(list.getTail());
        }
        return false;
    }
}
