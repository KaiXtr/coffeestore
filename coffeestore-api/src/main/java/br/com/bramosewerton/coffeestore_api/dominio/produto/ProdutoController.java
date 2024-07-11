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

    @GetMapping("/ping")
    public ResponseEntity<String> getPing() {
        String resposta = "PONG!";
        return ResponseEntity.status(HttpStatus.OK).body(resposta);
    }

    @GetMapping("/")
    public ResponseEntity getAll(HttpServletRequest request) {
        var id = request.getAttribute("id");
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllProdutos());
        } catch (Exception e) {
            String resposta = "Houve um erro ao se comunicar com o Redis: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resposta);
        }
    }
}
