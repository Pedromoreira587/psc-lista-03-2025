import java.util.Scanner;

public class maiormenor {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
       int num2 = scanner.nextInt();

        System.out.println("digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        int maiorNumero = num1;
        int menorNumero = num1;
        double media = (num1 + num2 + num3)/3.0;
        
        if (num2 > maiorNumero && num2 > num3) {
            maiorNumero = num2;
        
        }else if (num3>maiorNumero) {
            maiorNumero = num3;
        }  else {
            maiorNumero = num1;
        }
        if (num2 < menorNumero && num2 < num3 ) {
            menorNumero = num2;
        
        } else if (num3 < menorNumero) {
            menorNumero = num3;
        } else {
            menorNumero = num1;
        }
    System.out.println("o maior numero é: " + maiorNumero);
    System.out.println("o menor numero é: " + menorNumero);
    System.out.printf("a media dos tres numeros e: %.2f" , media);
    
   

    
    }
  
}

