package br.com.melol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.melol.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}