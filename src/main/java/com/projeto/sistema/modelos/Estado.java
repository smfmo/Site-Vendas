package com.projeto.sistema.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "estado")
public class Estado implements Serializable {
    //atributos
    private String nome;

}
