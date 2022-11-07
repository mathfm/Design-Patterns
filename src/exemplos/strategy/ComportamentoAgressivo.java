package exemplos.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Se movendo para atacar...");
    }
}

