package com.github.rafaeldealmeida.arquiteturadesoftware.rpg1;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.github.awvalenti.arquiteturadesoftware.rpg1.Main;

public class Tabuleiro {
	private int Matriz[][];
	int altura, largura;
	
	public Tabuleiro(int altura, int largura){
		this.altura=altura;
		this.largura=largura;
		
	}
	
	for (int i = 0; i < altura; i++) {
		for (int j = 0; j < largura; j++) {
			if (Matriz[i][j] == 0) {
				frame.add(new JLabel(new ImageIcon(ImageIO.read(Main.class.getResourceAsStream("/agua.png")))));
			}
			if (Matriz[i][j] == 1) {
				frame.add(new JLabel(new ImageIcon(ImageIO.read(Main.class.getResourceAsStream("/maca.png")))));
			}
			if (Matriz[i][j] == 2) {
				frame.add(new JLabel(new ImageIcon(ImageIO.read(Main.class.getResourceAsStream("/personagem.png")))));
			}
			if (Matriz[i][j] == 3) {
				frame.add(new JLabel(new ImageIcon(ImageIO.read(Main.class.getResourceAsStream("/grama.png")))));
			}
		}
}
	
	
		
	
}
