package org.Murilo.capitulo13;
//Classe generica simples
//Sera substituido pelo tipo real quando um objeto do tipo gen for criado.

class Gen<T>{
    T ob; //Declara um objeto do tipo t

    //Passa pro construtor uma referencia a um objeto de tipo T.

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    //Exibe o tipo de T
    void ShowType(){
        System.out.println("Type of t is " + ob.getClass().getName());
    }

}


/*
    NumericFns tenta sem sucesso criar uma classe generica que possa
    executar varias funcoes numericas, como calcular o reciproco ou o componente
    fracionario, dado qualquer tipo de numero.

 */
//Usa um curinga
class NumericFns<M extends Number>{
    M num;

    //Passa para o construtor uma referencia a um objeto numerico
    NumericFns(M n){
        num = n;
    }
    double reciprocal(){
        return 1 / num.doubleValue();
    }


    //Retorna o componente fracionario
    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    //Determina valores absolutos de dois objetos nao iguais.
    boolean AbsEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }return false;
    }
}



public class GenDemo {
    static void main(String[] args) {
        //Cria uma referencia Gen para Integers
        Gen<Integer> iOb;

        //Cria um objeto Gen<Integer> e atribui sua referencia para IOb.
        //Observe o uso do autoboxing no encapsulamento do valor dentro de um objeto Integer

        iOb = new Gen<Integer>(88);

        //Exibe o tipo de dado usado por IOb
        iOb.ShowType();



        //Obtem o valor de iOb. Observe que nenhuma coercao e necessaria!
        int v = iOb.getOb();
        System.out.println("Value of V: " + v);

        System.out.println();

        //Cria um objeto Gen para Strings

        Gen<String> strOb = new Gen<String>("Generics Test");


        //Exibe o tipo usado por strOb
        strOb.ShowType();

        // obtem o valor de strob. Novamente, observe
        // que nenhuma coerção é necessária.

        String str = strOb.getOb();
        System.out.println("Value of str: " + str);


    }
}
