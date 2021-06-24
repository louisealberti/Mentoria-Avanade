package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avanade.dio.api.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, String> {

	public Produto findByCodigo(Integer codigo);

}
