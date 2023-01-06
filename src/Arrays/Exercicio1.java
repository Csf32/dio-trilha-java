package Arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        //Crie um vetor de 6 números inteiros e mostre a ordem inversa deles
        int i = 0;
        int[] vetor = {0, -5, 15, 50, 8, 4};
        
        while(i < vetor.length -1){
            System.out.println(vetor[i]);
            i++;
        }
        
        System.out.println("Fim");

        System.out.println("Vetor inverto");
        for(int j = vetor.length-1; j == 0; j--){
            System.out.println(vetor[j]);
        }
       
    }
}
