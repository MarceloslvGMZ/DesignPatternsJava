package Facade;

import subSystem1.CRMService;
import subSystem2.CepAPI;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepAPI.getInstancia().recuperarCidade(cep);
		String estado = CepAPI.getInstancia().recuperarEstado(cep);
		
		CRMService.gravarCliente(nome, cep, cidade, estado);
	}

}
