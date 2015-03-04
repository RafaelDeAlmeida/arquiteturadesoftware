package com.github.rafaeldealmeida.arquiteturadesoftware.rpg1;

public enum Elemento {
	Agua, Grama, Maça, Personagem;
	
	public enum ElementoEnum{
		Agua(1), Grama(2), Maça(3), Personagem(4);
		
		public int valorElemento;
		ElementoEnum(int valor){
				valorElemento = valor;
		}
	}
}
