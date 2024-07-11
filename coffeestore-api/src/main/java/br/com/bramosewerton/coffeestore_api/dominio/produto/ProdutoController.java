package br.com.bramosewerton.coffeestore_api.dominio.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/")
    public ResponseEntity getAll(HttpServletRequest request) {
        var id = request.getAttribute("id");
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllProdutos());
    }
}
