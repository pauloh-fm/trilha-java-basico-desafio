import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Fazer o scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Fazer as perguntas  e armazenar os valores nas variaveis
        // número da agência
        System.out.println("Por favor, informe o número da agência: ");
        String agencia = scanner.nextLine();

        // número da conta
        System.out.println("Por favor, informe o número da conta: ");
        int numero = scanner.nextInt();

        // saldo da conta
        // saldo da conta
        System.out.println("Por favor, informe o saldo da conta: ");
        String saldoInput = scanner.next().replace(",", "."); // modifica todas as "," por '.'
        double saldo = Double.parseDouble(saldoInput);


        scanner.nextLine();
        // nome do cliente
        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
    //TODO: Mensagem de resposta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}