package model;

import utils.Utils;

import java.util.Date;

public class Pessoa {
	
	private static int contador = 1;

	private int numeroDeCliente;
	private String nome;
	private String cpf;
	private Date accountCreationDate;
	
	

	public Pessoa(String nome, String cpf) {
		this.numeroDeCliente = Pessoa.contador;
		this.nome = nome;
		this.cpf = cpf;
		this.accountCreationDate = new Date();
		Pessoa.contador += 1;
	}

	public int getNumeroDeCliente() {
        return this.numeroDeCliente;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }
	
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCPF " + this.getCpf() +
				"\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
	}

}