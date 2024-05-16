
import java.util.Locale;
import java.util.Scanner;


public class ContaBanco {
    public static void main(String[] args){
        System.out.println("===========CADASTRO BANCO PAYGOIN!=============");
        System.out.println("");

        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //pegando as informações do cliente
        System.out.println("Primeiro nome: ");
        String nome = scanner.next();
       
        System.out.println("Digite o número da agencia: ");
        String numeroAgencia = scanner.next();

        
        System.out.println("Digite O Número da Conta: ");
        int contaNumero = scanner.nextInt();

        System.out.println("Digite O salto para depósito: ");
        double saldoDeposito = scanner.nextDouble();

        //apenas para dar espaço
        System.out.println("");

        System.out.println("Olá " + nome + ", Obrigada por criar uma conta em nosso Banco");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + contaNumero + " e seu saldo R$" + saldoDeposito + " já está disponível.");


    }
}
