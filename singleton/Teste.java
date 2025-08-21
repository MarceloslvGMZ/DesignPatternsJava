package singleton;

public class Teste {

	public static void main(String[] args) {
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

	}

}
