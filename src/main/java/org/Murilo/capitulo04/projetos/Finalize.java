package org.Murilo.capitulo04.projetos;

public class Finalize {
    public static void main(String[] args) {


        FDemo obj = new FDemo(0);

        for(int i = 0; i < 1000; i++){
            obj.generator(i);
        }
        System.gc();
    }
}
class FDemo{
    int x;

    FDemo(int i){
        x = i;
    }
    // chamada quando o objeto é reciclad
    protected void finalize(){
        System.out.println("Finalizing " + x);

    }
    // gera um objeto que é imediatamente destruído
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}


