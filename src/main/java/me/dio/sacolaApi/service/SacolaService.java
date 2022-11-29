package me.dio.sacolaApi.service;

import me.dio.sacolaApi.model.dto.ItemDto;
import me.dio.sacolaApi.model.Item;
import me.dio.sacolaApi.model.Sacola;

import java.util.List;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagmento);

    List<Sacola> verTodas();
}
