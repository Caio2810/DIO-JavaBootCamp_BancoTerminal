import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("#######################################################");
        System.out.println("################Olá, bem vindo ao banco################");
        System.out.println("#######################################################");


        System.out.print("Digite o número da sua conta, por gentileza: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("Ótimo! Agora digite o número da agência: ");
        String agenciaConta = scan.nextLine();

        System.out.print("Obrigado, digite o seu nome: ");
        String nomeConta = scan.nextLine();


        System.out.print("Excelente! Para finalizar digite o seu saldo: ");
        double saldoConta = scan.nextDouble();

        System.out.println("#######################################################");
        System.out.print("Olá "+ nomeConta+ ", obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é "+ agenciaConta+ ", conta "+ numeroConta+ " e seu saldo ");
        System.out.print(saldoConta+ " já está disponível para saque.");
    }
}