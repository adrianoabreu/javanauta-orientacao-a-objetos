package heranca;

public class Principal {

    public static void main(String[] args){

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beber();
        caramelo.dormir();

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("Gão de milho");
        gertrudez.beber();
        gertrudez.dormir();

    }
}
