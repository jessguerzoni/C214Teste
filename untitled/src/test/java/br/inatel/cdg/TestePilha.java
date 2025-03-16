
package br.inatel.cdg;


import org.junit.Assert;
import org.junit.Test;

public class TestePilha {


    @Test
    public void testePilhaVazia(){
         Pilha<Integer>pilha=new Pilha<>();
         boolean isVazia=pilha.Vazia();

         //Verificando se ta vazia

        Assert.assertTrue(isVazia);

     }
     @Test
     public void testePush1Elemento(){
        Pilha<Integer>pilha=new Pilha<>();
        pilha.push(23);
        Assert.assertFalse(pilha.Vazia());
        Assert.assertEquals(1,pilha.totElemento());


     }

}
