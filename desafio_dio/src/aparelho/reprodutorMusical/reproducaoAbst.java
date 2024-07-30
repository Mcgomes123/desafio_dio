package aparelho.reprodutorMusical;

public abstract class reproducaoAbst implements reproducaoIntfc {
	
	protected String nome;
	
	public reproducaoAbst(String nome) {
		this.nome = nome;
	}
	
	public void tocar() {
		System.out.println(nome + "esta tocando");
	}
	
	public void pausar() {
		System.out.println(nome + "pausada!");
	}
	
	public void selecionarMusica(String nome) {
		this.nome = nome;
		System.out.println(nome + "selecionada");
	}
	
	public String getNome() {
		return nome;
	}

}

