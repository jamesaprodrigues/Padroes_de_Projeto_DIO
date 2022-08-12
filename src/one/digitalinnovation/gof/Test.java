package one.digitalinnovation.gof;
import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.*;



public class Test {
	
	//Singleton
	
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstatncia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstatncia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstatncia();
		System.out.println(eager);
		eager = SingletonEager.getInstatncia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
	
	
	    Comportamento defensivo = new ComportamentoDefensivo();
	    Comportamento normal = new ComportamentoNormal();
	    Comportamento agressivo = new ComportamentoAgressivo();
	    
	    Robo robo = new Robo();
	    robo.setComportamento(defensivo);
	    robo.mover();
	    robo.setComportamento(normal);
	    robo.mover();
	    robo.mover();
	    robo.setComportamento(agressivo);
	    robo.mover();
	    robo.mover();
	    robo.mover();
	    robo.mover();
	    
	    //Facade
	    
	    Facade facade = new Facade();
	    facade.migrarCliente("James", "09896310");
	    
	}	

}
