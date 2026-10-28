package org.Murilo.padraoprojeto;
import java.util.*;

//Receivers
class Luz{
    private final String local;
    public Luz(String local){this.local = local;}
    public void ligar(){
        System.out.println(local + ": luz ligada!");
    }
    public void desligar(){
        System.out.println(local + ": luz desligada!");
    }
}

class ArCondicionado{
    private int temperatura = 24;
    public int getTemperatura(){ return temperatura;}
    public void setTemperatura(int t){
        temperatura = t;
        System.out.println("Ar condicionado com " + t + "°C");
    }
}

//Concrete commands
class LigarLuzCommand implements Command{
    private final Luz luz;
    public LigarLuzCommand(Luz luz){this.luz = luz;}
    public void execute(){luz.ligar();}
    public void undo(){luz.desligar();}
}

class DesligarLuzCommand implements Command{
    private final Luz luz;
    public DesligarLuzCommand(Luz luz){this.luz = luz;}
    public void execute(){luz.desligar();}
    public void undo(){luz.ligar();}
}

//Comando com estado: guarda o valor anterior para conseguir desfazer
class AjustarTemperaturaCommand implements Command{
    private final ArCondicionado ar;
    private final int novaTemperatura;
    private int temperaturaAnterior;

    public AjustarTemperaturaCommand(ArCondicionado ar, int novaTemperatura){
        this.ar = ar;
        this.novaTemperatura = novaTemperatura;
    }
    public void execute(){
        temperaturaAnterior = ar.getTemperatura();
        ar.setTemperatura(novaTemperatura);
    }
    public void undo(){
        ar.setTemperatura(temperaturaAnterior);
    }
}

//Macro: um comando composto por varios (command + composite)
class MacroCommand implements Command{
    private final List<Command> comandos;
    public MacroCommand(List<Command> comandos){this.comandos = List.copyOf(comandos);}

    public void execute(){
        for(Command c : comandos) {
            c.execute();
        }
    }
    public void undo(){
        for(int i = comandos.size() - 1; i >= 0; i--) comandos.get(i).undo();
    }
}

//Invoker: executa os comandos e guarda o historico para desfazer
class ControleRemoto{
    private final Deque<Command> historico = new ArrayDeque<>();

    public void executar(Command c){
        c.execute();
        historico.push(c);
    }
    public void desfazer(){
        if(historico.isEmpty()){
            System.out.println("Nada para desfazer.");
            return;
        }
        historico.pop().undo();
    }
}

public class Command01 {
    public static void main(String[] args) {
        Luz sala = new Luz("Sala");
        Luz cozinha = new Luz("Cozinha");
        ArCondicionado ar = new ArCondicionado();
        ControleRemoto controle = new ControleRemoto();

        controle.executar(new LigarLuzCommand(sala));
        controle.executar(new AjustarTemperaturaCommand(ar, 20));

        System.out.println("--- Desfazendo ---");
        controle.desfazer(); // volta para 24°C
        controle.desfazer(); // desliga a luz da sala
        controle.desfazer(); // nada para desfazer

        System.out.println("--- Macro: modo cinema ---");
        Command modoCinema = new MacroCommand(List.of(
                new DesligarLuzCommand(sala),
                new DesligarLuzCommand(cozinha),
                new AjustarTemperaturaCommand(ar, 22)
        ));
        controle.executar(modoCinema);

        System.out.println("--- Desfazendo macro ---");
        controle.desfazer();
    }
}
