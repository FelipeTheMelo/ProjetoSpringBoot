package br.com.melol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.melol.domain.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
