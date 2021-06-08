package Aula10;

public class Pessoa {
	//ATRIBUTOS
	private String nome;
	private int idade;
	private String sexo;
	
	//METODOS
	public void fazerAniver() {
		this.setIdade(this.getIdade()+1);
	}
	
	//METODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	

}
