
import java.util.Scanner;

public class raiocirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor que deseja utilizar na operação");
        double valor = scanner.nextDouble();
        System.out.println("digite o numero corespondente a o peração que deseja realisar:");
        System.out.println("1 para perimetro do circulo");
        System.out.println("2 para area de um circulo");
        System.out.println("3 para volume de esfera");
        int comand = scanner.nextInt();
        
        switch (comand) {
            case 1 -> {
                double pr = (2*Math.PI*valor);
                System.out.printf("o resultado da operação e: %.2f  " ,pr);
            }
            case 2 -> {
                double ar = (Math.PI*(valor*valor));
                System.out.printf("o resultado da operação e: %.2f  " ,ar);
            }
            case 3 -> {
                double vl = (4/3)*Math.PI*(valor*valor*valor);
                System.out.printf("o resultado da operação e: %.2f  " ,vl);
            }
            default -> {
                System.out.println("o codigo digitado não corresponde a nunhuma operação" );
                
                throw new AssertionError();
            }
        }
    
    }
    
}
