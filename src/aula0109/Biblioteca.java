package aula0109;

public class Biblioteca {
	
	public static void main(String[] args){
		Pessoa autor = new Pessoa("Eduardo");
		Livro php = new Livro(autor);
		php.setNome("php 5");
		
		System.out.println("O nome do livro é: "+ php.getNome());
		
		System.out.println("O nome do autor é: " + php.getPessoa());
	}
}
