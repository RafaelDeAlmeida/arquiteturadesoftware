package com.github.rafaeldealmeida.arquiteturadesoftware.rpg1;

public enum Elemento {
	Agua, Grama, Ma�a, Personagem;
	
	public enum ElementoEnum{
		Agua(1), Grama(2), Ma�a(3), Personagem(4);
		
		public int valorElemento;
		ElementoEnum(int valor){
				valorElemento = valor;
		}
	}
}
