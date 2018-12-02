package com.company;

public class EmptyIntList  implements IntList{

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public String toString() {
        return "]";
    }

    @Override
    public IntList cons(int n) {
        return new NonEmptyIntList(n, this);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void addInt(int n) {

    }

    @Override
    public IntList concat(IntList list) {
        return list;
    }

    @Override
    public IntList clone(){
        return this;
    }

    @Override
    public int getElement(){
        throw new NullPointerException();
    }

    public IntList getTail(){
        return null;
    }

    @Override
    public boolean equals(IntList list){
        return list.isEmpty();
    }

}
