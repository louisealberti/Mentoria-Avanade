package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.model.Preco;
import com.avanade.dio.api.model.Produto;

public interface PrecoRepository extends CrudRepository<Preco, String> {
	public Preco findByCodigoProduto(Produto codigoProduto);
}