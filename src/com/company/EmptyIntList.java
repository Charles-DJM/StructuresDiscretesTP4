package com.company;

public class EmptyIntList  implements IntList{

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public IntList cons(int n) {
        return
    }

    @Override
    public int length() {
        return 0;
    }
}
