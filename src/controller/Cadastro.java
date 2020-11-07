package controller;
	// So nao esta com a acentuacao, pois costuma dar erro quando importado o codigo, ja que nao costuma comportar o teclado UTF-8.
public class Cadastro {
	// Variaveis globais de uso geral em todas classes.
	public int opp;
    public int op1;
    // Numero de contas criadas, para assim poder dar uma posição no vetor para a conta.
    public static int accNum = 0;
    // Variavel que faz o app ficar rodando.
    public static boolean app;
    public static void main(String[] args) {
       new Cadastro01();
       Login log = new Login();
       Logado online = new Logado();
       new Contas();
        app = false;
        do {
           Cadastro01.Cadastro();
           if(Cadastro01.contaCriada == true) {
        	   accNum += 1;
           }
           // Try catch so foi usado para o programa continue, mesmo que os valores deem null, que aí o codigo continua rodando.
           try {
        	   Contas.contas();
        	 } catch (NullPointerException nexc) {
        	   Contas.contasVazias();
        	 }  finally {
        		 Contas.contasVazias();
        	 }
           log.LoginUser();
           online.logado();
        } while (!app);
    }
   
    
}
