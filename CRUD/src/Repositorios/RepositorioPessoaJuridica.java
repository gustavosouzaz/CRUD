package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Model.Pessoa;
import Model.PessoaJuridica;

public class RepositorioPessoaJuridica  {
	
	
	public class RepositoryPessoaJuridica implements IRepositorio {
		List<PessoaJuridica> listaPJ = new ArrayList<PessoaJuridica>();

		@Override
		public boolean atualiza(Pessoa pessoa) {
			boolean ok = false;
			PessoaJuridica pj = (PessoaJuridica) pessoa;
			try {
				for (int i = 0; i < listaPJ.size(); i++) {
					if (listaPJ.get(i).getCnpj().equals(pj.getCnpj())) {
						listaPJ.get(i).setNome(pj.getNome());
						ok = true;
					}
				}
			} catch (Exception e) {
				ok = false;
			}

			return ok;
		}

		
		public boolean inseri(Pessoa pessoa) {
			boolean ok = false;
			try {
				listaPJ.add((PessoaJuridica) pessoa);
				ok = true;
			} catch (Exception e) {
				ok = false;
			}
			// TODO Auto-generated method stub
			return ok;
		}

		
		public boolean apaga(String identificador) {
			boolean ok = false;
			try {
				for (int i = 0; i < listaPJ.size(); i++) {
					if (listaPJ.get(i).getCnpj().equals(identificador)) {
						listaPJ.remove(i);
						ok = true;
					}
				}
			} catch (Exception e) {
				ok = false;
			}

			return ok;
		}

		
		public List<?> retornaLista() {
			return listaPJ;
		}

	
	
	}
}