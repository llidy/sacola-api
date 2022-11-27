package me.dio.sacolaApi.service;

import me.dio.sacolaApi.model.dto.ItemDto;
import me.dio.sacolaApi.model.Item;
import me.dio.sacolaApi.model.Sacola;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagmento);

}
