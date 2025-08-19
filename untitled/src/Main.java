import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nuemro: ");
        Double numero1 = scanner.nextDouble();

        System.out.println("Digite outro numero:");
        Double numero2 = scanner.nextDouble();

        System.out.println("Digite um operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        Double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                if (numero2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }

        System.out.println("resultado:" + resultado);

        scanner.close();
    }
}