/ *
 QUESTÃO URI 1096 Sequencia IJ 2:

 Você deve fazer um programa que apresente a sequência conforme o exemplo abaixo.
 http://prntscr.com/jy6j5w
 
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
        int j = 7;

        //SAÍDA DOS DADOS:
        while (i <= 9) {
            while (j >= 5) {
                System.out.println("I="+i+" J="+j);
                j = j - 1;
            }
            
            j = 7;
            i = i + 2;
        }
 
    }
 
}
