import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configuração para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + 
                        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                        ", conta " + numero + 
                        " e seu saldo " + df.format(saldo) + 
                        " já está disponível para saque";
        
        System.out.println(mensagem);

        scanner.close();
    }
}
