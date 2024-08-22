import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        
        String agencia, nomeCliente;
        int numero;
        
        System.out.println("Seja Bem-Vindo ao nosso Banco Digital");
        System.out.println("--------------------------------------------");

        System.out.println("Digite sua Conta: ");
        numero = sc.nextInt();

        System.out.println("-----------------------------------------");

        System.out.println("Digite Agencia");
        agencia = sc.next();

        System.out.println("-----------------------------------------");

        System.out.println("Informe seu Nome e Sobrenome");
        nomeCliente = sc.next();

        sc.next();

        System.out.println("-----------------------------------------");

        System.out.println("Valor a ser depositado");
        double saldo = sc.nextDouble();

        System.out.println("-----------------------------------------");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso" + 
        " banco, sua agência é: " + numero + ", conta " + agencia + " com saldo inicial " + saldo);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Obrigado pela preferência e Volte Sempre");
        System.out.println("-----------------------------------------");
    }
}
 