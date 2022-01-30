/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.padroes.gft.singleton;

public class SingletonTipo2 {

    //Ao cria a variável já instancia e quando chamarem a instancia já retorna.    
    private static SingletonTipo2 instancia = new SingletonTipo2();

    public SingletonTipo2() {
        super();
    }

    public static SingletonTipo2 getInstancia() {
        return instancia;
    }

}
