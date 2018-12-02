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

    IntList getTail();

    /** @param val la valeur à insérer
     * @param pos la position de l’insertion
     * @return
     */
    boolean add(int val, int pos);

    /** @param val la valeur à mettre en position pos
     * @param pos la position de la mise à jour
     * @return
     */
    boolean set(int val, int pos);

    /** @param pos la position de la suppression
     * @return
     */
    boolean remove(int pos);



}
