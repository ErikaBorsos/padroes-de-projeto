/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.padroes.gft.strategy;

public class TesteStrategy {
    
    public static void main(String[] args) {
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        
        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        
        robo.setStrategy(defensivo);
        robo.mover();
        
    }
    
}
