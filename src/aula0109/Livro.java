package aula0109;

public class Livro{
	
	private String nome;
	private Pessoa pessoa;
	
	public Livro(Pessoa pessoa){
		super();
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String value){
		nome = value;
	}
}
