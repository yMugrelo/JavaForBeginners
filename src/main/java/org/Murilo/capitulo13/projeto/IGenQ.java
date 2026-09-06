package org.Murilo.capitulo13.projeto;

//Interface de fila generica

import org.Murilo.capitulo09.projeto.QueueEmptyException;
import org.Murilo.capitulo09.projeto.QueueFullException;

public interface IGenQ <T>{
    //Insere um item na fila
    void put(T ch) throws QueueFullException1;

    //Retira um item da fila
    T get() throws QueueEmptyException1;
}
