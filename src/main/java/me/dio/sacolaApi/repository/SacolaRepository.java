package me.dio.sacolaApi.repository;

import me.dio.sacolaApi.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SacolaRepository extends JpaRepository<Sacola, Long> {
}
