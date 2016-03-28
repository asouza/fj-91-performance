package br.com.caelum.fj91.performance.daos;

import org.springframework.data.repository.CrudRepository;

import br.com.caelum.fj91.performance.models.Transacao;

public interface TransacaoDao extends CrudRepository<Transacao, Long>{

}
