package subsistema;

public class CepApi {
    private static final CepApi instance = new CepApi();

    public CepApi() {
    }
    public static CepApi getInstance() {
        return instance;
    }
    public String recuperarCidade(String cep){
        return "são paulo";
    }
    public String recuperarEstado(String estado){
        return "SP";
    }

}
