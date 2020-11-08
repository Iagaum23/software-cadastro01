package controller;

import util.IntegridadeCPF;

public class Contas {
	public static void contas(int totalContas) {
		new Login();
		// Essa classe so foi criada para ter uma parte separada para si, para aplicar uma manutencao nela quando necessaria.
		System.out.println("\t---Contas atuáis---\t\n\tContas totais:"+totalContas);
		for (int x = 0; x < 5; x++) {
			System.out.println(x+" matricula|\nNomes de usuarios:\t\""+Login.nome[x]+"\"\tSenhas:\t\""+Login.senha[x]+"\"\tEmail:\t\""+Login.email[x]+"\"\nCPF:"+IntegridadeCPF.imprimeCPF(Login.cpf[x])+"\n");
		}
		System.out.println();
	}
	public static void contasVazias() {
		System.out.println("Sem conta cadastrada|\nNomes de usuários:\t\"Null\"\tSenhas:\t\"Null\"\tEmail:\t\"Null\"\nCPF:Null\n");
	}
}
