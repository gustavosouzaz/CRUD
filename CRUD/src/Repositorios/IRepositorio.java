package Repositorios;

import java.util.List;

import Model.Pessoa;

public interface IRepositorio {
	
	
	public boolean atualiza(Pessoa pessoa);
	public boolean inseri(Pessoa pessoa);
	public boolean apaga(String identificador);
	public List<?> retornaLista();
	
	
}
