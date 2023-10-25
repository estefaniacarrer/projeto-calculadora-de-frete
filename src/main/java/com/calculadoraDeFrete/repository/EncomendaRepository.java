package com.calculadoraDeFrete.repository;

import com.calculadoraDeFrete.model.Encomenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EncomendaRepository extends JpaRepository<Encomenda, Long> {
    Optional<Encomenda> findByUuid(UUID uuid);
    List<Encomenda> findByDescricaoContainingIgnoreCase(String descricao);
}
