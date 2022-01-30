/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema2.cep;

public class CepApi {
    
    private static class EncapsulaInstancia{
        public static CepApi instancia = new CepApi();
    }

    private CepApi() {
        super();
    }
    
    public static CepApi getInstancia(){
        return EncapsulaInstancia.instancia;
    }
    
    //quem for usar será pela instância e terá acesso
    public String getCidade(String cep){
        return "São Paulo";
    }
    
    public String getEstado(String cep){
        return "SP";
    }
    
}
