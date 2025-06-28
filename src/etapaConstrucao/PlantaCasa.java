package etapaConstrucao;

public class PlantaCasa implements Construcao {

    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    @Override
    public void construir(){
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero de quartos: " + numeroQuartos);
        System.out.println("Numero de banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor " + cor);
    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintar(){
        System.out.println("Cor: " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat) {
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;
        construir();
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }
}
