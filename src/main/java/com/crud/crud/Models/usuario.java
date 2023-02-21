package com.crud.crud.Models;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Table (name = "usuario")
@Entity
@EqualsAndHashCode
@ToString
public class usuario {
    @Id
    @Getter @Setter @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "edad")
    private int edad;    
}
