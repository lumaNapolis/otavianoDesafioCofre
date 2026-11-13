
// Luma Napolis RA: 1261947451
// Nicolas Xavier RA:1261933040

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Cofre cofre01 = new Cofre(4444, true);

        cofre01.guardarItens();
        cofre01.visualizarItens();
        cofre01.trancar();
        cofre01.guardarItens();
        cofre01.visualizarItens();
        cofre01.destrancar();
        cofre01.destrancar();
        cofre01.destrancar();
        cofre01.visualizarItens();
        cofre01.retirar();
        cofre01.visualizarItens();

    }
}
