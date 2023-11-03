package com.api.produto.repositorio;

import java.util.List;
import com.api.produto.modelo.ProdutoModelo;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{
	
	//Listar todos os produtos
	List<ProdutoModelo> findAll();
	
	//Pesquisar por codigo
	ProdutoModelo findByCodigo(int codigo);
	
	//Remover produto
	void delete(ProdutoModelo produto);
	
	//Cadastrar/Alterarprodutoo
	ProdutoModelo save(ProdutoModelo produto);
}
