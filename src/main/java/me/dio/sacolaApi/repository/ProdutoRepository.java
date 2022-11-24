package me.dio.sacolaApi.repository;

import me.dio.sacolaApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
