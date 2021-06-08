package Exercicio2;

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
    public Pessoa(String nome, int idade,  String sexo) {
    	setNome(nome);
    	setIdade(idade);
    	setSexo(sexo);
    }
    
    public String getNome() {
    	return nome;
    }
    
    public int getIdade() {
    	return idade;
    }
    
    public  String getSexo() {
    	return sexo;
    }
    
    public void setNome(String n) {
    	this.nome = n;
    }
    
    public void setIdade(int i) {
    	this.idade = i;
    }
    
    public void setSexo(String s) {
    	this.sexo = s;
    }
    
}
