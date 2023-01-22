package DesafioIntermed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<String> lista = new ArrayList<String>();
    
        String arquivoDoPc = leitor.next();
        
        if(arquivoDoPc.contains(".mp3")) {
                lista.add(arquivoDoPc);
                System.out.println("Salvar" + lista);
            }
        
        else {
            lista.remove(arquivoDoPc);
            System.out.println("Deletar" + lista);
        }
                    
        leitor.close();
    }
}
    
           
    

