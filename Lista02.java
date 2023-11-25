// Larissa Amaral Bonasina

import java.util.Scanner;

public class Lista02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        exercicio1(scanner);

        // Exercício 2
        exercicio2(scanner);

        // Exercício 3
        exercicio3(scanner);

        // Exercício 4
        exercicio4(scanner);

        // Exercício 5
        exercicio5(scanner);

        scanner.close();
    }

    // Exercício 1
    private static void exercicio1(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double soma = calcularSoma(num1, num2);
        System.out.println("A soma é: " + soma);
    }

    // Exercício 2
    private static void exercicio2(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        double media = calcularMedia(num1, num2, num3);
        System.out.println("A média é: " + media);
    }

    // Exercício 3
    private static void exercicio3(Scanner scanner) {
        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = scanner.nextDouble();
        double tempFahrenheit = converterParaFahrenheit(tempCelsius);
        System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);
    }

    // Exercício 4
    private static void exercicio4(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        int numeroVogais = contarVogais(inputString);
        System.out.println("O número de vogais na string é: " + numeroVogais);
    }

    // Exercício 5
    private static void exercicio5(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        imprimirTabuada(numeroInteiro);
    }

    // Métodos dos exercícios 1 e 2
    private static double calcularSoma(double a, double b) {
        return a + b;
    }

    private static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Método do exercício 3
    private static double converterParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método do exercício 4
    private static int contarVogais(String str) {
        int countVogais = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVogais++;
            }
        }
        return countVogais;
    }

    // Método do exercício 5
    private static void imprimirTabuada(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
