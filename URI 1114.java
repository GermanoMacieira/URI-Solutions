/*
 QUESTÃO URI 1114 Senha Fixa:

 Escreva um programa que repita a leitura de uma senha até que ela seja 
 válida. Para cada leitura de senha incorreta informada, escrever a mensagem 
 "Senha Invalida". Quando a senha for informada corretamente deve ser 
 impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere 
 que a senha correta é o valor 2002. 
 
 ENTRADA:
 A entrada é composta por vários casos de testes contendo valores inteiros.

 SAÍDA:
 Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner imput = new Scanner(System.in);
   
        //ENTRADA DOS DADOS:
        int senha = imput.nextInt();

        //TRATAMENTO DOS DADOS:
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = imput.nextInt();
        }

        //SAÍDA DOS DADOS:
        System.out.println("Acesso Permitido");

        imput.close();

    }
 
}
