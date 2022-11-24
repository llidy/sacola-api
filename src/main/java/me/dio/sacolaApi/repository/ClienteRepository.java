package me.dio.sacolaApi.repository;

import me.dio.sacolaApi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
