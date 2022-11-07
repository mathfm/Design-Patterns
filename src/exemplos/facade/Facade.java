package exemplos.facade;

import subsistema.CepApi;
import subsistema.CrmService;

public class Facade {

    public void register(String name, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(name, cep, cidade, estado);
    }
}
