import java.util.Scanner;

public class Principal {
    static String[] pilotos = new String[20]; // array dos pilotos da corrida
    static float[] tempo = new float[20]; // array dos tempos da volta
    static float tMedio = 0; // flot para o tempo médio de todas as corridas
    static float tMaior = -1; // float para o maior tempo das corridas
    static float tMenor = 1000; // float para o menor tempo das corridas

    public static void main(String[] args) { //Classe Main

        Scanner input = new Scanner(System.in); // Scanner

        for (int i = 0; i < pilotos.length; i++) { // Criando for para capturar os 20 pilotos
            System.out.println("Nome do Piloto " + (i + 1) + ":"); // Inserir nome dos pilotos
            pilotos[i] = input.nextLine(); // Scanner capturando a informação
        }
        for (int i = 0; i < pilotos.length; i++) { // Criando for para capturar o tempo das 20 voltas

            System.out.println("Tempo do Piloto " + (i + 1) + ":"); // Inserir o tempo da conclusão de cada piloto
            tempo[i] = input.nextFloat(); // Scanner capturando a informação
        }
        input.close();// fechar scanner

        vencedor(); // chamando metodo pra calcular o vencedor
        perdedor(); // chamando metodo pra calcular o ultimo lugar
        chamarMedia(); // chamando metodo pra calcular a média das voltas da corrida

    }

    static void vencedor() { // metodo pra calcular o vencedor
        int vencedor = 0; // inicializando a variavel vencedor
        for (int i = 0; i < tempo.length; i++) {// for para modificar a variável i
            if (tempo[i] <= tMenor) { // if pra procurar o tempo menor da corrida
                tMenor = tempo[i]; // definir o tempo menor como tMenor
                vencedor = i; // definindo vencedor com a posição do array

            }
        }
        System.out.println("O vencedor da corrida é: " + pilotos[vencedor]); // imprimir o primeiro lugar da corrida

    }

    static void perdedor() { // metodo pra calcular o ultimo lugar
        int perdedor = 0; // inicializando a variavel perdedor
        for (int i = 0; i < tempo.length; i++) { // for para modificar a variável i
            if (tempo[i] > tMaior) { // if pra procurar o tempo maior da corrida
                tMaior = tempo[i]; // definir o tempo maior como tMaior
                perdedor = i; // definindo perdedor com a posição do array

            }
        }
        System.out.println("O último colocado da corrida é: " + pilotos[perdedor]); // imprimir o ultimo lugar da corrida


    }

    public static void chamarMedia() { // metodo para achar a média das voltas da corrida
        for (int i = 0; i < tempo.length; i++) { // for para modificar a variável i
            tMedio += tempo[i] / tempo.length; // variavel para somar as medias

        }
        System.out.println("Tempo médio das voltas da corrida: " + tMedio); // imprimir o tempo médio da corrida
    }

}