package com.java.fiap;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa("João", "joao@email.com", "senha123");
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("Autenticado? " + pessoa.autenticar("senha123"));

		// Testando a classe Fatura
		Fatura fatura = new Fatura(1, 100.0, new Date(), 0);
		System.out.println("Número da fatura: " + fatura.getNumeroFatura());
		System.out.println("Valor da fatura: " + fatura.getValor());
		System.out.println("Data de vencimento da fatura: " + fatura.getDataVencimento());

		// Testando a classe ContaBancaria
		ContaBancaria conta = new ContaBancaria(1, 500.0, null, 0, "123456", "Corrente");
		System.out.println("Saldo da conta: " + conta.getSaldoConta());
		conta.depositar(200.0);
		System.out.println("Saldo da conta após depósito: " + conta.getSaldoConta());
		conta.sacar(50.0);
		System.out.println("Saldo da conta após saque: " + conta.getSaldoConta());
	}
}