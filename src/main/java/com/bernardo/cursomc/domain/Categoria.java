package com.bernardo.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    // Construtor vazio (obrigatório para frameworks como JPA e Jackson)
    public Categoria() {
    }

    // Construtor com argumentos
    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters corretos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos hashCode e equals corrigidos
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Categoria other = (Categoria) obj;
        return Objects.equals(id, other.id);
    }
}
