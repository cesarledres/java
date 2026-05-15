package br.com.sigFolha.model;

public class Horista extends Funcionario {

	private int horas;
	private double valorHora;

	public Horista (String nome, int horas, double valorHora) {
		super (nome);
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public void calcularSalario(){
		super.salario = this.horas * this.valorHora;
		super.calcularSalarioLiquido();
	}
}
