package Associacao;

//Composição
public class Carro {

    //Composição
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cilindradas) {
        this.motor = new Motor(cilindradas);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void mostrarCilindradas(){
        System.out.println("Carro com motor de " + motor.getCilindradas() + " cilindradas");
    }
}
