package Associacao;

import java.util.List;

//Agregação
public class Departamento {

    private String nome;

    //Agregação
    private List<Funcionario> listaFuncionarios;

    public Departamento(String nome, List<Funcionario> listaFuncionarios) {
        this.nome = nome;
        this.listaFuncionarios = listaFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void mostrarFuncionarios(){
        System.out.println("Departamento " + nome);
        listaFuncionarios.forEach(funcionario -> System.out.println(funcionario));
    }
}
