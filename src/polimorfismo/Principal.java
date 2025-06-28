package polimorfismo;

public class Principal {

    public static void main(String[] args){

        int mamao = 2;
        int sabaoPo = 1;
        double arroz = 5.90;
        double sabonete = 2.50;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(arroz, sabonete);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);

    }
}
