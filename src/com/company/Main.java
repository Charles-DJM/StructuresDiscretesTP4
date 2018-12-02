package com.company;

public class Main {

    public static void main(String[] args) {

        IntList myList1 = // [1, 2, 3]
                new EmptyIntList().cons(3).cons(2).cons(1);
        IntList myList2 = // [1, 2, 3]
                new EmptyIntList().cons(3).cons(2).cons(1).cons(0);
        System.out.println(myList1.equals(myList2));

    }
}

