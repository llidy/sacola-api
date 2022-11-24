package me.dio.sacolaApi.repository;

import me.dio.sacolaApi.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}
