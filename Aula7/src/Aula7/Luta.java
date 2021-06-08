package Aula7;

import java.util.Random;

public class Luta {
	//ATRIBUTOS
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	//METODOS
	public void marcaLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() &&  l1 != l2) {
			this.aprovado = true;
			this.setDesafiado (l1);
			this.setDesafiante(l2);		
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void Lutar() {
		if(this.aprovado) {
			System.out.println("\n### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("\n### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int Vencedor = aleatorio.nextInt(3);
			switch (Vencedor) {
				case 0: 
					System.out.println("Luta terminou empatada!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
				break;
				case 1:
					System.out.println(this.desafiado.getNome() + " Ganhou a luta");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
				break;
				case 2:
					System.out.println(this.desafiante.getNome() + " Ganhou a luta");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
				break;
			}
		}else {
			System.out.println("Luta não pode acontacer!");
		}
	}
	
	//METODOS ESPECIAIS
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}
	
	public void setDesafiado(Lutador n) {
		this.desafiado = n;
	}
	
	public void setDesafiante(Lutador m) {
		this.desafiante = m;
	}
	
	public void setRounds (int r) {
		this.rounds = r;
	}
	
	public void setAprovado(boolean a) {
		this.aprovado = a;
	}

}
