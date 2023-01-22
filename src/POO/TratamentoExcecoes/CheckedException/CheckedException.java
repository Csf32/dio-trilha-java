package POO.TratamentoExcecoes.CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {
    public static void main(String[] args) throws IOException {
     
        String nomeDoArquivo = "romances-black-crouch.txt";
        
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } 
        
        catch(FileNotFoundException e){
            JOptionPane.showInputDialog("Revise o nome do arquivo" + e.getMessage());
        } 
        
        catch (IOException e) {
            JOptionPane.showInputDialog("Erro inesperado, entre em contato com o suporte" + e.getCause());
        }
       
        System.out.println("Apesar da exception ou não, oprograma continua...");
    }  
       
       
       public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
        
            File file = new File();
            
            BuferedReader br = new BuferedReader(new FileReader(file.getName()));
            String line = br.readLine();
            
            BuferedWriter bw = new BuferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
                
            }
            while(line != null);
            bw.flush();
            
        }
 


}

class File {

    public String getName() {
        return null;
    }

    public File() {
    }

    

}

class BuferedReader{

    public BuferedReader() {
    }

    public String readLine() {
        return null;
    }

    public BuferedReader(FileReader fileReader) {
    }

 
    


}

class BuferedWriter {

    public BuferedWriter(OutputStreamWriter outputStreamWriter) {
    }

    public void flush() {
    }

    public void newLine() {
    }

    public void write(String line) {
    }


}