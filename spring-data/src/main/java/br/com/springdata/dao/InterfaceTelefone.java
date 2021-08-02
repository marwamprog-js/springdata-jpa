package br.com.springdata.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.springdata.model.Telefone;

@Repository
public interface InterfaceTelefone extends CrudRepository<Telefone, Long>{

}
