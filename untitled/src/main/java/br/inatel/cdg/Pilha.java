package br.inatel.cdg;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T>{

    private List<T> elementos;
    private int qtdeElementos;

    public Pilha(){
        elementos=new ArrayList<>();
    }
    public boolean Vazia(){
        return qtdeElementos==0;


    }
    public void push(T elemento){
        this.elementos.add(elemento);
        qtdeElementos++;
    }
    public T pop(){
        T elemento=this.elementos.remove(--qtdeElementos);
        return elemento;
    }
    public int totElemento(){
        return qtdeElementos;
    }

}
