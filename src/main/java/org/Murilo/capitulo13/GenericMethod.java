package org.Murilo.capitulo13;


//Demonstra um metodo generico simples
public class GenericMethod {
    //Determina se o conteudo de dois arrays sao iguais
    static <T extends Comparable<T>, V extends T>
    boolean ArrayEquals(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i < x.length; i++){
            if(!x[i].equals(y[i])) return false;

        }
        return true;
    }

    static void main(String[] args) {

        Integer nums [] = { 1, 2, 3, 4};
        Integer nums2[] = { 1, 2, 3, 4, 5};
        Integer nums3[] =  { 1, 2, 7, 4, 5};
        Integer nums4 [] = { 1, 2, 7, 4, 5, 6};

        if (ArrayEquals (nums, nums2)) System.out.println("nums equals nums");

        if (ArrayEquals(nums, nums3)) System.out.println("nums equals nums3");

        if(ArrayEquals(nums, nums4)) System.out.println("nums equals nums4");





        // Cria um array de Doubles
        Double dvals [] = { 1.1, 2.2, 3.3, 4.4, 5.5};




    }
}
