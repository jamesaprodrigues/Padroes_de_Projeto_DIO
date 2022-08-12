package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
	
	private static SingletonLazy instancia;
		
		private SingletonLazy() {
			super();
	}
		
		public static SingletonLazy getInstatncia() {
			if (instancia == null) {
				instancia = new SingletonLazy();
			}
			return instancia;
		}

}
