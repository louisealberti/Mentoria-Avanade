package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.model.Loja;

public interface LojaRepository extends CrudRepository<Loja, String> {
	public Loja findByCodigo(Integer codigo);
}
