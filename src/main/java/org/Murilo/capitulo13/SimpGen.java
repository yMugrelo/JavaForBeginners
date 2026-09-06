package org.Murilo.capitulo13;


//Classe generica com dois parametros
class TwoGen<T, V>{
    T obv1;
    V obv2;

//Passa para o construtor referencias
//a objetos do tipo T e V.
    TwoGen(T o1, V o2){
        obv1 = o1;
        obv2 = o2;
    }

    // Exibe os tipos e T e V.
    void ShowTypes(){
        System.out.println("Type of T is " + obv1.getClass().getName ());
        System.out.println("Type of V is " + obv2.getClass().getName ());
    }

    public T getObv1() {
        return obv1;
    }

    public V getObv2() {
        return obv2;
    }
}


//Demonstra TwoGen
public class SimpGen {
    static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88,"generics");
        //Exibe os tipos
        tgObj.ShowTypes();

        System.out.println();

        int v = tgObj.getObv1();
        System.out.println("Value: " + v);

        String str = tgObj.getObv2();
        System.out.println("Value: " + str);





    }
}
