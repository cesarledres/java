package br.com.sigFolha.model;

public class Mensalista extends Funcionario {

	private String cargo;

	public Mensalista(String nome, String cargo){
		super(nome);
		this.cargo=cargo;
	}

	public void calcularSalario(){
		if (cargo.equals("Junior")){
			super.salario = 2000;
		}else if (cargo.equals("Pleno")){
			super.salario = 5000;
		}else if (cargo.equals("Senior")){
			super.salario = 7000;
		}else {
			super.salario = 0;
		}
		super.calcularSalarioLiquido();
	}
}
