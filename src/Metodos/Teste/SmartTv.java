package Metodos.Teste;

public class SmartTv {

    public String estadoTV;
    public String volume;
    public int mexerVolume;
    public int volumeDesejado;

    public void ligarDesligar(){
        
        if(estadoTV.equals("Ligada")){
            System.out.println("A TV está ligada");
        }
        else {
            System.out.println("A TV não está ligada");
        }
        
    }
   
    public void volumeTV() {

        if(volume.equals("Sim")) {
          
            for(int mexerVolume = 1; mexerVolume < volumeDesejado; mexerVolume++) {
                
                System.out.println("Volume: " + mexerVolume);
            }
            System.out.println("Tv está no volume desejado: " + (volumeDesejado));
        }   
       
    }

    









    }

