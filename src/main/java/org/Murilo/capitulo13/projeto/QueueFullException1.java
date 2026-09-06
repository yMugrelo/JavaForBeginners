package org.Murilo.capitulo13.projeto;



public class QueueFullException1 extends Exception{
    int size;

    QueueFullException1(int s) {size = s; }

    public String toString(){
        return "\nQueue is full. Maximum size is" + size;

    }
}
