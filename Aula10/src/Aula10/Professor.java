package Aula10;

public class Professor extends Pessoa{
	//ATRIBUTOS
     private String especialidade;
     private float salario;
     
     //METODOS
     public void receberAume(float m) {
    	 this.salario += m;
     }
     
     //METODOS ESPECIAIS
     
     public String getEspecialidade() {
    	 return especialidade;
     }
     
     public void setEspecialidade(String especialidade) {
    	 this.especialidade = especialidade;
     }
     
     public float getSalario() {
    	 return salario;
     }
     
     public void setSalario(float salario) {
    	 this.salario = salario;
     }
}
