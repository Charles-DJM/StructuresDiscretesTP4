package com.company;

public class Main {

    public static void main(String[] args) {

        IntList myList1 = // [1, 2, 3]
                new EmptyIntList().cons(3).cons(2).cons(1);
        IntList myList2 = myList1.clone();

        System.out.println(myList1.equals(myList2));

        myList1.add(5,2);
        System.out.println(myList1);

        myList2.set(4,3);
        System.out.println(myList2);

        myList1.remove(1);
        System.out.println(myList1);
    }
}

