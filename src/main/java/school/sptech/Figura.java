package school.sptech;

public abstract class Figura {
    private String cor;
    private Integer espessura;

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }

    public abstract Double calcularArea();

    public Figura(){}

    @Override public String toString(){
        return "A cor da figura é " + cor + " e a espessura e sua espessura é " + espessura;
    }
}
