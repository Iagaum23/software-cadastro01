package controller;

import javax.swing.JOptionPane;

import util.IntegridadeCPF;

public class Logado {
	Cadastro cad = new Cadastro();
	Login log = new Login();
	Cadastro01 cad1 = new Cadastro01();
	Object[] op2 = {"Voltar ao menu inicial", "Sair"};
	public void logado() {
		 cad.opp = JOptionPane.showOptionDialog(null, "Olá Sr(a)"+Login.accLogged[0]+"\nE-mail: "+Login.accLogged[1]+" \nDono do CPF:\t"+IntegridadeCPF.imprimeCPF(Login.accLogged[2])+"\nO que o Sr(a) gostaria de fazer ?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op2, op2[0]);
         if ((String)op2[cad.opp] == "Sair") {
             System.exit(0);
         }
	}
}
