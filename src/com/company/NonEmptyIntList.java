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

    @Override
    public boolean add(int val, int pos){
        if(pos == 1){
            IntList newElement = new NonEmptyIntList(this.element, this.tail);
            this.element = val;
            this.tail = newElement;
            return true;
        }
        if(pos == 2){
            IntList newElement = new NonEmptyIntList(val, this.tail);
            this.tail = newElement;
            return true;
        }
        return this.tail.add(val, pos-1);
    }

    @Override
    public boolean set(int val, int pos){
        if(pos == 1){
            this.element = val;
            return true;
        }
        else{
            return this.tail.set(val, pos-1);
        }
    }
}


