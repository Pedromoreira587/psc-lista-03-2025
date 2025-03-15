import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero real: ");
        double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero real: ");
        double num2 = scanner.nextDouble();

        System.out.println("digite o simbulo corespondente a o peração que deseja realisar:");
        System.out.println("'+' para soma");
        System.out.println("'-' para subtração");
        System.out.println("'*' para multiplicação");
         System.out.println("'/' para divisão");
        System.out.println("'^' para potenciação");
        String comand = scanner.next();
        
        switch (comand) {
            case "+" -> { 
                double soma = num1 + num2;
                System.out.println(soma);    
            }
            case "-"-> {
                double sub = num1 - num2;
                System.out.println(sub);     
            }
            case "*" -> {
                double mult = num1 * num2;
                System.out.println(mult);    
            }
            case "/" ->{
                double div = num1 + num2;
                System.out.println(div);
            }
            case "^"->{
                double pot = Math.pow(num1,num2);
                System.out.println(pot);
            }
            default -> {
                System.out.println("o simbolo digitado não corresponde a nunhuma operação" );
                
                throw new AssertionError();
            }
        }
    }
    
    
}
