package com.company;

public class Main {

    public static void main(String[] args) {

        IntList myList = new EmptyIntList().cons(3).cons(2).cons(1);
        System.out.println(myList);
        myList.addInt(3);
        System.out.println(myList);
    }
}
