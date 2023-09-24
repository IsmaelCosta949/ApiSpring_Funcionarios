package com.example.apiptratica.Funcionarios;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "funcionario")
public class Funcionario{

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "data_admissao")
    private Date dataAdmissao;

    @Column(name = "salario")
    private BigDecimal salario;

    @Column(name = "departamento")
    private String departamento;

    // getters e setters

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
