package controller;

import javax.swing.JOptionPane;

import util.IntegridadeCPF;

import util.IntegridadeCPF;
@SuppressWarnings("unused")
public class Cadastro {
	// Base de programa de Cadastro. Ainda falta colocar banco de dados!
	public static void main(String[] args) {
		String laranja1[] = new String[10];
		String laranja2[] = new String[10];
		String laranja3[] = new String[10];
		String laranja4[] = new String[10];
		Object[] options = { "Sim", "Não" };
		int resp = JOptionPane.showOptionDialog(null, "Você já tem conta?", "Cadastro.", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		if ((String) options[resp] == "Não") {
			Object[] options1 = { "Sim", "Não" };
			int resp1 = JOptionPane.showOptionDialog(null, "Gostaria de se cadastrar?", "Cadastro.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if ((String) options1[resp1] == "Não") {
				System.exit(0);
			}
			String nomeDeUsuario = JOptionPane.showInputDialog(null, "Informe seu nome de usuário:", "Cadastro.", JOptionPane.PLAIN_MESSAGE);
			laranja1[0] = nomeDeUsuario;
			String email = JOptionPane.showInputDialog(null, "Informe seu e-mail:", "Cadastro.", JOptionPane.PLAIN_MESSAGE);
			laranja3[0] = email;
			String senha = JOptionPane.showInputDialog(null, "Informe sua senha:", "Cadastro.",	JOptionPane.PLAIN_MESSAGE);
			laranja2[0] = senha;
			String CPF = JOptionPane.showInputDialog(null, "Informe seu CPF:", "Cadastro.", JOptionPane.PLAIN_MESSAGE);
			laranja4[0] = CPF;
			while (IntegridadeCPF.CPF(CPF) == false) {
				 if (IntegridadeCPF.CPF(CPF) == true) {
		              System.out.printf("%s\n", IntegridadeCPF.imprimeCPF(CPF));
				 }
				CPF = JOptionPane.showInputDialog(null, "Informe seu CPF:", "Cadastro.", JOptionPane.PLAIN_MESSAGE);
				laranja4[0] = CPF;
				if (IntegridadeCPF.CPF(CPF) == true) {
		              System.out.printf("%s\n", IntegridadeCPF.imprimeCPF(CPF));
				 }
			} 
			JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.", "Cadastro.", JOptionPane.PLAIN_MESSAGE);
		} 
		JOptionPane.showMessageDialog(null, "Faça Login.", "Login.", JOptionPane.PLAIN_MESSAGE);
		String email = JOptionPane.showInputDialog(null, "Insira seu e-mail:", "Login.", JOptionPane.PLAIN_MESSAGE);
		String senha = JOptionPane.showInputDialog(null, "Insira sua senha:", "Login.", JOptionPane.PLAIN_MESSAGE);
		do {
			JOptionPane.showMessageDialog(null, "Nome de usuário/senha incorretos.");
			email = JOptionPane.showInputDialog(null, "Insira seu e-mail:", "Login.",JOptionPane.PLAIN_MESSAGE);
			senha = JOptionPane.showInputDialog(null, "Insira sua senha:", "Login.", JOptionPane.PLAIN_MESSAGE);
		} while (email.equals(laranja3[0])== false || senha.equals(laranja2[0])==false);
		JOptionPane.showMessageDialog(null, "Login confirmado Sr(a) " + laranja1[0] + "!\nSeu CPF é:"+IntegridadeCPF.imprimeCPF(laranja4[0]), "Login.", JOptionPane.PLAIN_MESSAGE);
	}
}