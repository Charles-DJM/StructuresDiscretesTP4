package com.company;

public class Main {

    public static void main(String[] args) {

        IntList myList = new EmptyIntList().cons(3).cons(2).cons(1);
        IntList mylist2 = new EmptyIntList().cons(4).cons(5).cons(6);

        IntList mylist3 = myList.concat(mylist2);
        System.out.println(mylist3);
    }
}
