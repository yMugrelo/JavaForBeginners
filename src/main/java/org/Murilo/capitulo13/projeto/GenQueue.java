package org.Murilo.capitulo13.projeto;



public class GenQueue <T> implements IGenQ<T>{
    private T q[]; //Esse array contem a fila
    private int putloc, getloc; //indices de insercao e retirada


    //Constroi uma fila vazia com o array dado
    public GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    //Insere um item na fila
    public void put(T obj )throws QueueFullException1 {

            if(putloc == q.length){
                throw new QueueFullException1(q.length);
            }
            q[putloc++] = obj;
        }




    //Retira um item da fila
    public T get() throws QueueEmptyException1 {

            if(getloc == putloc){
                throw new QueueEmptyException1();
            }
            return q[getloc++];

    }

}
