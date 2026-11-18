package com.ejemplo.articulos.repository;

import com.ejemplo.articulos.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository ya incluye findAll, findById, save y deleteById.
// Spring crea la implementación automáticamente, así que no hace falta escribirla.
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
}