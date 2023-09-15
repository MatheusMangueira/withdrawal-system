package account;

import java.util.Scanner;

import client.Client;

public class CreateAccount {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Account depositValue = new Account();
		 
		Client client = new Client();		
		client.setCfp("000.000.000-00");
		client.setName("Matheus");
		
		int ag = 123;
		depositValue.setAg(ag);
		
		int cc = 111;
		depositValue.setCc(cc);
		
		while(true) {
			System.out.println(" Olá, " + client.getName() + " Do CPF: " +
					client.getCfp() + " conta: " + depositValue.getCc()
					+ " / " + depositValue.getAg()
					+ " o que vc deseja fazer? D=Deposito, S=Saque, E=Sair");
			String op = scanner.nextLine();

			if(op.equals("D")) {
				System.out.println("Qual valor deseja depositar?");
				double value = scanner.nextDouble();
				depositValue.deposit(value);
			} else if (op.equals("S")) {
				System.out.println("Qual valor do saque?");
				double value = scanner.nextDouble();
				depositValue.withdraw(value);
			} else if (op.equals("E")) {
				break;
			} else {
				System.out.println("Invalido!! Digite os comandos corretamente.");
			}
			
			scanner = new Scanner(System.in);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//double valueDeposit = 2500.0;
		//depositValue.deposit(valueDeposit);
		//deposit amount 
		//System.out.println("valor de deposito: " +
		//depositValue.getDeposit() + " R$. " + client.getName()
		//+ " do CPF: " + client.getCfp() + " conta " +
		//depositValue.getCc() + " / " + depositValue.getAg());
		
		//whithDraw
		//double valueWithDraw = 300;
		//System.out.println("saque: " + valueWithDraw + " R$");
		//depositValue.withdraw(valueWithDraw);
		
		//if(valueDeposit > valueWithDraw) {
			//System.out.println("valor depois do saque " + 
			//depositValue.getDeposit() + " R$");
		//}	
	} 
	
}
