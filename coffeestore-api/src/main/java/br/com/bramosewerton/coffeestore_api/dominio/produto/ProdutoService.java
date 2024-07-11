package br.com.bramosewerton.coffeestore_api.dominio.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repo;

    public Iterable<Produto> getAllProdutos() {
        return repo.findAll();
    }
}
