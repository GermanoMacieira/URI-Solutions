/ *
 QUESTÃO URI 1095 Sequencia IJ1:

 Você deve fazer um programa que apresente a sequência conforme o exemplo abaixo.
 
 ENTRADA:
 Não há nenhuma entrada neste problema.

 SAÍDA:
 Imprima a sequencia conforme exemplo abaixo
* /

import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {

        //ATRIBUTOS:
        int i = 1;
        int j = 60;

        //SAÍDA DOS DADOS:
        while ( j >= 0) {
            System.out.println("I="+i+" J="+j);
                i = i + 3;
                j = j - 5;
        }
 
    }
 
}
