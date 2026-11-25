// Paquete que contiene la clase de modelo
package com.ejemplo.articulos.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity indica que esta clase se guarda en la base de datos (tabla "articulo")
@Entity
@Table(name = "articulos")
public class Articulo {

    // @Id marca el campo que identifica cada fila
    // @GeneratedValue hace que MySQL asigne el número automáticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    // Constructor vacío requerido por JPA y por Jackson
    public Articulo() {}

    public Articulo(Long id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}