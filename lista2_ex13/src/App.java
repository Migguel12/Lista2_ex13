import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o numero do dia da semana: ");
        double dia = ler.nextDouble();
        System.out.println("");

        ler.close();

        if(dia == 1){
            System.out.println("Domingo");
        }

        else if(dia == 2){
            System.out.println("Segunda feira");
        }

        else if(dia == 3){
            System.out.println("Terca feira");
        }

        else if(dia == 4){
            System.out.println("Quarta feira");
        }

        else if(dia == 5){
            System.out.println("Quinta feira");
        }

        else if(dia == 6){
            System.out.println("Sexta feira");
        }

        else if(dia == 7){
            System.out.println("Sabado");
        }

        else{
            System.out.println("Valor invalido");
        }
    }
}
