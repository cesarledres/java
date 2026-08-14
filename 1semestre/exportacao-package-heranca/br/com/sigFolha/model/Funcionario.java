package br.com.sigFolha.model;

public class Funcionario {

	protected String nome;

	protected double salario;

	public Funcionario (String nome) {
		this.nome = nome;
		this.salario = salario;
	}

	public void calcularSalarioLiquido() {
		this.salario = this.salario - calcularINSS() - calcularIRPF();
	}

	public double calcularINSS() {
		if (this.salario <=1200){
			return this.salario *0.075;
		}else if (this.salario<=2427){
			return this.salario *0.09;
		}else if (this.salario<=3641){
			return this.salario*0.12;
		}else if (this.salario<=7887){
			return this.salario*0.14;
		}else{
			return 7887*0.14;
		}
	}

	public double calcularIRPF() {
		if (this.salario<=1903){
			return 0;
		}else if(this.salario<=2826){
			return this.salario *0.075;
		}else if (this.salario<=3751){
			return this.salario*0.15;
		}else if(this.salario <= 4664){
			return this.salario*0.22;
		}else{
			return this.salario *0.275;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
}
