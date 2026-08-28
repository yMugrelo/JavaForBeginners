package org.Murilo.capitulo09.projeto;

public interface ICharQ {
    void put(char ch) throws QueueFullException ;

    char get() throws QueueEmptyException;
}
