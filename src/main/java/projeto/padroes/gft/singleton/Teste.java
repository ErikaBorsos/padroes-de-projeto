/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.padroes.gft.singleton;

public class Teste {

    public static void main(String[] args) {

        //Teste com SingletonTipo1
        SingletonTipo1 tipo1 = SingletonTipo1.getInstacia();
        System.out.println(tipo1);
        //retorma a mesma instancia
        tipo1 = SingletonTipo1.getInstacia();
        System.out.println(tipo1);
        //retorma a mesma instancia
        SingletonTipo1 tipo12 = SingletonTipo1.getInstacia();
        System.out.println(tipo12);

        //Teste com SingletonTipo2
        SingletonTipo2 tipo2 = SingletonTipo2.getInstancia();
        System.out.println(tipo2);
        //retorma a mesma instancia
        tipo2 = SingletonTipo2.getInstancia();
        System.out.println(tipo2);
        //retorma a mesma instancia
        SingletonTipo2 tipo21 = SingletonTipo2.getInstancia();
        System.out.println(tipo21);

        //Teste com SingletonTipo3
        SingletonTipo3 tipo3 = SingletonTipo3.getInstancia();
        System.out.println(tipo3);
        //retorma a mesma instancia
        tipo3 = SingletonTipo3.getInstancia();
        System.out.println(tipo3);
        //retorma a mesma instancia
        SingletonTipo3 tipo31 = SingletonTipo3.getInstancia();
        System.out.println(tipo31);

    }

}
