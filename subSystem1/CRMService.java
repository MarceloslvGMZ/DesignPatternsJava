package subSystem1;

public class CRMService {

	public CRMService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String Estado) {
		System.out.println("Cliente Salvo com SUcesso");
		
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(Estado);
	}
}
