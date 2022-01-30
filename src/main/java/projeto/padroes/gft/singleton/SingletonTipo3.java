/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.padroes.gft.singleton;

public class SingletonTipo3 {

    //encapsular a instancia em uma classe estática interna
    private static class EncapsulaInstancia {

        public static SingletonTipo3 instancia = new SingletonTipo3();
    }

    private SingletonTipo3() {
        super();
    }

    public static SingletonTipo3 getInstancia() {
        return EncapsulaInstancia.instancia;
    }

}
