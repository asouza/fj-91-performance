package br.com.caelum.fj91.performance.daos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.caelum.fj91.performance.models.Transacao;

@Repository
public interface TransacaoDao extends
		PagingAndSortingRepository<Transacao, Long> {

}
