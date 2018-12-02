package com.company;

public interface IntList {
    /**@return vrai si la liste es vide faux sinon*/

    boolean isEmpty();

    IntList cons(int n);

    int length();

    String toString();

    /** @param n l’entier à ajouter aux éléments de la liste
     * @return
     */
    void addInt(int n);

    /** @param list la liste à concaténer
     * @return la concaténation de this et list
     */
    IntList concat(IntList list);

    /**
     * @return une copie de la liste
     */
    IntList clone();

    boolean equals(IntList list);

    int getElement();
}
