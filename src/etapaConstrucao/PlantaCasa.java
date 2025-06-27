package etapaConstrucao;

public class PlantaCasa {

    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    protected void construir(){
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero de quartos: " + numeroQuartos);
        System.out.println("Numero de banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }
}
