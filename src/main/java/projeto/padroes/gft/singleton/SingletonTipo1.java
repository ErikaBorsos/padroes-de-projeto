/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.padroes.gft.singleton;

public class SingletonTipo1 {
    
    private static SingletonTipo1 instancia;

    //private -> para que ninguém instancie
    private SingletonTipo1() {
        super();
    }
    
    public static SingletonTipo1 getInstacia(){
        if(instancia == null){
            instancia = new SingletonTipo1();
        }
        return instancia;
    }
    
}
