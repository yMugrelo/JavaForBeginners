package org.Murilo.capitulo04;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr (double base, int exp){
        this.b = base; //This referencia a variável de instância b e não o parâmetro.

        this.e = exp;

        val = 1;
        if(exp == 0) return;
        for(;exp>0; exp--)val = val*base;

    }
    double get_pwr(){
        return val;
    }
}

class DemoPwr{
    static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(8.0, 3);
        Pwr z = new Pwr(5, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }
}