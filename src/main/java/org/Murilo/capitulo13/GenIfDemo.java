package org.Murilo.capitulo13;


class MyClass<T> implements Containment<T> { //Toda classe que implemente
    // uma interface genérica também deve ser genérica.


    T[] arrayRef;

    public MyClass(T[] o) {
        arrayRef = o;
    }

    public boolean contains(T o) {
        for (T x : arrayRef) {
            if (x.equals(o)) return true;
        }
        return false;
    }



}


public class GenIfDemo {
    static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains (2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");
        if (ob.contains (5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");


    }
}
