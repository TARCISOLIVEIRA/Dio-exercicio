/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;


public class ContaTerminal {

    
    public static void main(String[] args) {
       
  Scanner in = new Scanner(System.in);      
int numero = 0;
double saldo = 0;
String agencia = "";
String nomeCliente = "";
        
    System.out.println("------CONTA BANCARIA---------");
    System.out.println("");
    System.out.print("Por favor , digite o numero da conta.....:");
    numero = in.nextInt();
    System.out.println("------AGENCIA---------");
    System.out.print("Digite o nome da agencia.....:");
    agencia = in.next();
    System.out.println("--------- CLIENTE-----------");
    System.out.print("digite o seu nome....:");
    nomeCliente = in.next();
    System.out.println("----------- SALDO ------------");
    System.out.print("Informe o seu saldo atual...");
    saldo = in.nextDouble();
    
    System.out.println("Ola,  " +  nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " ja esta disponivel para saque.");
       
    }
    
}
