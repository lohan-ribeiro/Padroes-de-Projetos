package onedigitalinnovation.gof;

import onedigitalinnovation.gof.facade.Facade;
import onedigitalinnovation.gof.singleton.SingletonEager;
import onedigitalinnovation.gof.singleton.SingletonLazy;
import onedigitalinnovation.gof.singleton.SingletonLazyHolder;
import onedigitalinnovation.gof.strategy.Comportamento;
import onedigitalinnovation.gof.strategy.ComportamentoAgressivo;
import onedigitalinnovation.gof.strategy.ComportamentoDefensivo;
import onedigitalinnovation.gof.strategy.ComportamentoNormal;
import onedigitalinnovation.gof.strategy.Robo;

public class Teste {
  public static void main(String[] args) {

    // testes relacionados ao designer pattern singleton

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);

    // Strategy

    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();

    // Facade

    Facade facade = new Facade();
    facade.migrarCliente("Venilton", "14801788");
  }
}
