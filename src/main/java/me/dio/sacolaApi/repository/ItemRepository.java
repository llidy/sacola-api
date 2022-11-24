package me.dio.sacolaApi.repository;

import me.dio.sacolaApi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
