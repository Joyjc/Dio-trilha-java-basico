import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("067-8\r\n" + //
                        ":");
        String agencia = scanner.nextLine();

        System.out.println("1021:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("MARIO ANDRADE\r\n" + //
                        ":");
        String nomeCliente = scanner.nextLine();

        System.out.println("237.48\r\n" + //
                        ":");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                           agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

