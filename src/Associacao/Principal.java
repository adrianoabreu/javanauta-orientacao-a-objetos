package Associacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        //Composição
        Carro fusca = new Carro(20);
        fusca.mostrarCilindradas();

        //Agregação
        Funcionario joao = new Funcionario("João");
        Funcionario joana = new Funcionario("Joana");
        Funcionario mateus = new Funcionario("Mateus");
        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(joao);
        listaFuncionario.add(joana);
        listaFuncionario.add(mateus);

        Departamento ti = new Departamento("TI", listaFuncionario);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
