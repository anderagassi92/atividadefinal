package br.com.senac.concessionaria.concessionariabackendapi.repository;

import br.com.senac.concessionaria.concessionariabackendapi.modelo.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacaRepository extends JpaRepository<Modelo, Long> {
}
