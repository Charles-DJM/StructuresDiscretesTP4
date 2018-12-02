package com.company;

public class Main {

    public static void main(String[] args) {

        IntList myList = // [1, 2, 3]
                new EmptyIntList().cons(3).cons(2).cons(1);
        IntList myList2 = // [0, 2, 3]
                new EmptyIntList().cons(3).cons(2).cons(0);
        IntList myList3 = myList.clone();
        System.out.println(myList);
        System.out.println(myList3);
    }
}

