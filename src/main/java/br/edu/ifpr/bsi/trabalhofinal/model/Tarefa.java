/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.trabalhofinal.model;

import java.time.LocalDate;

/**
 *
 * @author Gabis
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private String concluida;
    private LocalDate data;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, String concluida, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String isConcluida() {
        return concluida;
    }

    public void setConcluida(String concluida) {
        this.concluida = concluida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
