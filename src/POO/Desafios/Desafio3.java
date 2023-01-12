package POO.Desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int diasParaLer = paginas/paginasLidas;
        
        leitor.close();
        System.out.println(diasParaLer + " dias");
        
    }
}
