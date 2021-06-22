package br.com.willyan.regescweb.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity //Para definir que a classe é uma entidade para o Spring
public class Professor {
    @Id//Define que o id é o indice da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Faz o sistema gerar em ordem crescente o id
    private Long id;

    @Column(nullable = false)//Proíbe que o valor seja nulo
    private String nome;
    private BigDecimal salario;

    @Enumerated(EnumType.STRING)//Seta para o sistema que o o enum é do tipo String
    private StatusProfessor statusProfessor;

    //Obrigatório ter um construtor vazio
    public Professor() {
    }

    public Professor(String nome, BigDecimal salario, StatusProfessor statusProfessor) {

        this.nome = nome;
        this.salario = salario;
        this.statusProfessor = statusProfessor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", statusProfessor=" + statusProfessor +
                '}';
    }
}
