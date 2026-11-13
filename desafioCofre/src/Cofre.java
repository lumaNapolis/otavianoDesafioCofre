import java.util.Scanner;


public class Cofre {

//get set

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String[] getItens() {
        return itens;
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isDesbloqueado() {
        return desbloqueado;
    }

    public void setDesbloqueado(boolean desbloqueado) {
        this.desbloqueado = desbloqueado;
    }

    //atributos

    int i = 0;
    private int senha;
    private int contador = 0;
    private String[] itens = {"","","","","","","","","",""};
    private boolean aberto;
    private boolean desbloqueado;

    //construtor

    public Cofre(int senha, boolean aberto) {
        this.senha = senha;
        this.aberto = aberto;
    }


    public void trancar() {
        if (aberto) {
            aberto = false;
            System.out.println("O cofre foi trancado");
        }
    }

    public void retirar() {

        int j = 0;

        if (aberto) {
            while (j < itens.length) {

                itens[j] = "";

                j++;

            }

            System.out.println("O cofre foi esvaziado");

        } else {
            System.out.println("Deve-se abrir o cofre primeiro");
        }

    }


    public void visualizarItens(){
        if (aberto){
            System.out.println("Os itens são:");

            int j = 0;
            while (j < itens.length) {
                System.out.println(itens[j]);
                j++;
            }
        } else {
            System.out.println("Abra o cofre primeiro");
        }
    }

    public void guardarItens() {

        Scanner leia = new Scanner(System.in);




        if (aberto) {

            System.out.println("quantos itens deseja guardar? A capacidade maxima do cofre é 10");

            int j = leia.nextInt();


            while (i < j) {
                System.out.println("Digite o nome do item");


                itens[i] = leia.next();

                i++;
            }


        } else {
            System.out.println("O cofre está fechado. Não será possível guardar os itens");
        }


    }

    public void destrancar(){

        if (!aberto) {

            Scanner leia = new Scanner(System.in);

            int senhaDigitada;


            System.out.println("Digite a senha");
            senhaDigitada = leia.nextInt();

            if (senhaDigitada == senha) {

                aberto = true;
                System.out.println("cofre destrancado");
                contador = 0;

            } else {

                System.out.println("Senha incorreta");
                contador++;

                if (contador == 3) {
                    desbloqueado = false;
                }
            }
        } else {
            System.out.println("O cofre já está aberto");
        }
    }






}


