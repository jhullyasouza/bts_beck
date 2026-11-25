package com.seduc2.bts.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
@Entity
public class BTS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nome;
    @Past
    private LocalDate nasc;
    @NotNull
    private NomeArtistico nomeArtistico;
    @Positive
    private int idade;
    @AssertTrue
    private boolean altura;

    public BTS(int id, String nome, LocalDate nasc, NomeArtistico nomeArtistico, int idade, boolean altura) {
        this.id = id;
        this.nome = nome;
        this.nasc = nasc;
        this.nomeArtistico = nomeArtistico;
        this.idade = idade;
        this.altura = altura;
    }

    public BTS(String nome, LocalDate nasc, NomeArtistico nomeArtistico, int idade, boolean altura) {
        this.nome = nome;
        this.nasc = nasc;
        this.nomeArtistico = nomeArtistico;
        this.idade = idade;
        this.altura = altura;
    }

    public BTS() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public NomeArtistico getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(NomeArtistico nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAltura() {
        return altura;
    }

    public void setAltura(boolean altura) {
        this.altura = altura;
    }
}
