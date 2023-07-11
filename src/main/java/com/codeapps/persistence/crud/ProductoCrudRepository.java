package com.codeapps.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codeapps.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    
    //ejemplo notivo
    // parametro como el nombre de la clase idCategoria
    @Query(value = "SELECT * from productos WHERE id_categoria = ?",nativeQuery = true)
    List<Producto> handleGetProductoPorIdCategoria(int idCategoria);



    // parametro como el nombre de la clase idCategoria
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>>  findByCantidadStockLessThanAndEstado(int cantidadStock,Boolean estado);
    

}
