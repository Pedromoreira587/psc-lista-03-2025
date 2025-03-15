import java.util.Scanner;

public class sorteio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int maiorNumero = num1;
        int menorNumero = num1;

        if (num2 > maiorNumero) {
            maiorNumero = num2;

        } else {
            maiorNumero = num1;
        }
        if (num2 < menorNumero) {
            menorNumero = num2;

        } else {
            menorNumero = num1;
        }
        int ale = (int) (Math.random() * (maiorNumero - menorNumero + 1) + menorNumero);

        System.out.println("o numero aleatorio gerado e: " + ale);

        if (ale % 2 == 0) {
            System.out.println("É par !");
        } else {
            System.out.println("É impar!");
        }
    }

}
