package org.Murilo.capitulo13.projeto;


import org.w3c.dom.ls.LSOutput;

//Demonstra uma classe generica de fila
public class GenQDemo {
    static void main(String[] args) {
        //Cria uma fila de inteiros
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstre a queue of Integers.");

        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Adding " + i + " to q.");
                q.put(i); //Adiciona o valor inteiro a q codigo
            }
        }catch (QueueFullException1 e) {
            System.out.println(e);
        }
        finally {
            System.out.println();
        }


        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Getting next integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException1 e){
            System.out.println(e);
        }
        System.out.println();


        //Cria uma fila double
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);


        Double dVal;
        System.out.println("Demonstrate a queue of Doubles");

        try{
            for(int i = 0; i < 5; i++){
                System.out.println(("Adding " + (double)i/2 + " to q2."));
                q2.put((double)i/2); //Adiciona o valor Double a q2
            }
        } catch (QueueFullException1 e) {
            System.out.println(e);

        }
        System.out.println();

        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Getting next double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }catch (QueueEmptyException1 e){
            System.out.println(e);
        }
        System.out.println();




    }
}
