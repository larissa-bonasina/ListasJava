// Larissa Amaral Bonasina

import java.util.Scanner;

public class Lista01 {
  public static void main(String[] args) {

    // Exercício 1
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o ano de nascimento: ");
    int anoNascimento = scanner.nextInt();
    int anoAtual = 2023;
    int idade = anoAtual - anoNascimento;
    System.out.println("Sua idade é: " + idade);

    // Exercício 2
    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();
    System.out.print("Escolha a operação (+, -, *, /): ");
    char operacao = scanner.next().charAt(0);
    double resultado = 0.0;
    switch (operacao) {
      case '+':
        resultado = num1 + num2;
        break;
      case '-':
        resultado = num1 - num2;
        break;
      case '*':
        resultado = num1 * num2;
        break;
      case '/':
        resultado = num1 / num2;
        break;
      default:
        System.out.println("Operação inválida.");
    }
    System.out.println("Resultado: " + resultado);

    // Exercício 3
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    if (numero % 2 == 0) {
      System.out.println("O número é par.");
    } else {
      System.out.println("O número é ímpar.");
    }

    // Exercício 4
    System.out.print("Digite a primeira nota: ");
    double nota1 = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = scanner.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    if (media >= 7) {
      System.out.println("Aprovado!");
    } else if (media >= 5) {
      System.out.println("Em recuperação.");
    } else {
      System.out.println("Reprovado.");
    }

    // Exercício 5
    System.out.print("Digite um número para a tabuada: ");
    int tabuadaNumero = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(tabuadaNumero + " x " + i + " = " + (tabuadaNumero * i));
    }

    // Exercício 6
    System.out.print("Digite a temperatura em Celsius: ");
    double tempCelsius = scanner.nextDouble();
    double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + tempFahrenheit);

    // Exercício 7
    int[] numeros = new int[5];
    int soma = 0;
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
      soma += numeros[i];
    }
    double mediaFinal = (double) soma / 5;
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + mediaFinal);

    // Exercício 8
    System.out.print("Digite o valor principal: ");
    double principal = scanner.nextDouble();
    System.out.print("Digite a taxa de juros anual: ");
    double taxaJurosAnual = scanner.nextDouble();
    System.out.print("Digite o período de tempo em anos: ");
    int tempoAnos = scanner.nextInt();
    double jurosSimples = principal * (taxaJurosAnual / 100) * tempoAnos;
    double valorTotal = principal + jurosSimples;
    System.out.println("O valor total após " + tempoAnos + " anos é: " + valorTotal);

    // Exercício 9
    System.out.print("Digite seu peso em kg: ");
    double peso = scanner.nextDouble();
    System.out.print("Digite sua altura em metros: ");
    double altura = scanner.nextDouble();
    double imc = peso / (altura * altura);
    System.out.println("Seu IMC é: " + imc);

    scanner.close();
  }
}
