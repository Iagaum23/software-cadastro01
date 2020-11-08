package controller;

import javax.swing.JOptionPane;

import util.IntegridadeCPF;

// So nao esta com a acentuacao, pois costuma dar erro quando importado o codigo, ja que nao costuma comportar o teclado UTF-8.
public class Cadastro {
	// Variaveis globais de uso geral em todas classes.
	public static int opp;
    public int op1;
    // Numero de contas criadas, para assim poder dar uma posição no vetor para a conta.
    private static int accNum = 0;
    // Variavel que faz o app ficar rodando.
    public static boolean app;
    public static void main(String[] args) {
       new Cadastro01();
       Login log = new Login();
       new Contas();
        app = false;
        do {
           Cadastro01.Cadastro(accNum);
           if(Cadastro01.contaCriada == true) {
        	   accNum += 1;
           }
           // Try catch so foi usado para o programa continue, mesmo que os valores deem null, que aí o codigo continua rodando.
           try {
        	   Contas.contas(accNum);
        	 } catch (NullPointerException nexc) {
        	   Contas.contasVazias();
        	 }  finally {
        		 Contas.contasVazias();
        	 }
           log.LoginUser(accNum);
           logado(accNum);
        } while (!app);
    }
	private static void logado(int matricula) {
		Object[] op2 = {"Voltar ao menu inicial", "Sair"}; 
		opp = JOptionPane.showOptionDialog(null, "Olá Sr(a)"+Login.accLogged[0]+"\nE-mail: "+Login.accLogged[1]+" \nDono do CPF:\t"+IntegridadeCPF.imprimeCPF(Login.accLogged[2])+"\n\tMatricula:"+matricula+"\nO que o Sr(a) gostaria de fazer ?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, op2, op2[0]);
         if ((String)op2[opp] == "Sair") {
             System.exit(0);
         }
	}
    
}
