package POO;

public class AtributosMetodos {
    public String cor;
    public String modelo;
    public int volumeTanque;
    public double valorCombustivel;
    
    public AtributosMetodos() {
        
    }
    
    public AtributosMetodos(String cor, String modelo, int volumeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.volumeTanque = volumeTanque;
    }
    
    public String getcor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVolumeTanque() {
        return volumeTanque;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVolumeTanque(int volumeTanque) {
        this.volumeTanque = volumeTanque;
    }

    public double totalValorTanque(double valorCombustivel) {
        return volumeTanque * valorCombustivel;
    }
}
