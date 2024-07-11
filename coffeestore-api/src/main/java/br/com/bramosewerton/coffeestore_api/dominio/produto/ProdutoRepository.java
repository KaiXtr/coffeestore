package br.com.bramosewerton.coffeestore_api.dominio.produto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, String> {
    Produto findByNome(String nome);
}
