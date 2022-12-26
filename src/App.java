public class App {
    public static void main(String[] args) {
        String nomeInicial = "Caique ";
        String nomeMeio = "Souza";
        String nomeCompleto = nomeCompleto(nomeInicial, nomeMeio);

        System.out.println("Bem vindo(a) ao curso da Dio-Java");
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nomeInicial, String noneMeio) {
        return "Resultado do método" + nomeInicial + noneMeio;
    }

}
