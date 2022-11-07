package subsistema;

public class CrmService {
    public CrmService() {}

    public static void gravarCliente(String nome, String cep, String cidade ,String estado){
        System.out.println("Cliente registrado no CRM");
        System.out.printf("Cliente: %s\nCep: %s\nCidade: %s\nEstado: %s",
                nome, cep, cidade, estado);
    }
}
