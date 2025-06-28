import etapaConstrucao.PlantaCasa;

public class Main {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();
        casa.pintar();
        System.out.println(casa.somarMetragem());

        casa.mudarCorParede("Branco");
        casa.alterarCaracteristicas(100, 2,2,"Madeira");

        Integer cpf = 01234567;
        String cpfConvertido = Util.conversorString(cpf);  //metodo estático

    }
}