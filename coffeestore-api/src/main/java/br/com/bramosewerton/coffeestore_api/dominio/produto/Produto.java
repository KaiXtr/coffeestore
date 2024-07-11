package br.com.bramosewerton.coffeestore_api.dominio.produto;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@RedisHash("produto")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(generator = "id")
    private String id;

    @Column(name = "nome")
    public String nome;

    @Column(name = "preco")
    public float preco;
}
