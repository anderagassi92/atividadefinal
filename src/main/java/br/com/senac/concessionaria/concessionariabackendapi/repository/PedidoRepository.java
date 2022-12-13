package br.com.senac.concessionaria.concessionariabackendapi.repository;

import br.com.senac.concessionaria.concessionariabackendapi.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
