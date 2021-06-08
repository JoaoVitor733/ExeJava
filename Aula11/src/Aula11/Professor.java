package Aula11;

public class Professor extends Pessoa{
	//ATRIBUTOS
	private String especialidade;
	private float salario;
	
	//METODOS
	public void receberAumen(float aumen) {
		this.salario = (this.salario*(aumen/100))+this.salario;
	}
	
	//METODOS ESPECIAIS
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String e) {
		this.especialidade = e;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float S) {
		this.salario = S;
	}
}
