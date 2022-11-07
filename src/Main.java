import exemplos.facade.Facade;
import exemplos.singleton.SingletonEager;
import exemplos.singleton.SingletonLazy;
import exemplos.singleton.SingletonLazyHolder;
import exemplos.strategy.*;

public class Main {
    public static void main(String[] args) {
        //Sinlgeton

        System.out.println("-----LAZY-----");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("-----EAGER-----");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);


        System.out.println("-----LAZYHOLDER-----");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        System.out.println("-----STRATEGY-----");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade
        System.out.println("-----FACADE-----");
        Facade facade = new Facade();
        facade.register("joao", "5480153");


    }
}