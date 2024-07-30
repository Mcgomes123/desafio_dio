package aparelho.navegadorInternet;

public abstract class navegadorAbst implements navegadorIntf {
	
	public void exibirPagina() {
		System.out.println("Exibindo a pagina.");
	}
    
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina.");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando pagina.");
	}
}

