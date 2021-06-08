package Exercicio1;

public class Espelho {
    String Cor;
    String Material;
    boolean Quebrado;
    int Tamanho;
    boolean Espelha;
    
    void Status() {
    	System.out.println("Cor do espelho: " + this.Cor);
    	System.out.println("O material ultilizado: " + this.Material);
    	System.out.println("O tamanho: " + this.Tamanho);
    	System.out.println("O espelho espelha? " + this.Espelha);
    }
    void Espelha() {
    	this.Espelha = true;
    }
    
   void Naospelha() {
    	this.Espelha = false;
    }
    
    void Quebrado() {
    	if(this.Espelha == false) {
    		System.out.println("O espelho estar quebrado");
    	}else {
    		System.out.println("O espelho estar perfeito");
    	}
    }
    
}
