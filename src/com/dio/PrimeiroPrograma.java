package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livros = new Livro();
		
		System.out.println(gato);
		System.out.println(livros);
		
		System.out.println("Deu certo?");
		
	}

}

class Livro {
	public String titulo;
	public String autor;
}
