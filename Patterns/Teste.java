package Patterns;

import Patterns.Singleton.*;
import strategy.*;
import Facade.*;


public class Teste {

	public static void main(String[] args) {
		
		// Singleton
		SingletonEager Eager = SingletonEager.getInstance();
		System.out.println(Eager);
		Eager = SingletonEager.getInstance();
		System.out.println(Eager);
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
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
		facade.migrarCliente("Marcelo", "75697800");
		
	}

}
