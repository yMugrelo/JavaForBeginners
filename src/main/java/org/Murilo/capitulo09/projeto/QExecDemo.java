package org.Murilo.capitulo09.projeto;

public class QExecDemo {
    static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);

        char ch;
        int i;

        try{
            for(i = 0; i < 11; i++){
                q.put((char) ('A' + i));
                System.out.println("- OK");
            }
            System.out.println();
        }catch(QueueFullException e){
            System.out.println(e);
        }
        System.out.println();
        try{
            for(i = 0; i < 11; i++){
                System.out.println("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        }catch(QueueEmptyException e){
            System.out.println(e);

        }

    }
}
