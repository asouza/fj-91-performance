package br.com.caelum.fj91.performance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.caelum.fj91.performance.daos.TransacaoDao;
import br.com.caelum.fj91.performance.models.Transacao;

@Controller
public class TransacoesController {

	@Autowired
	private TransacaoDao transacaoDao;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/transacoes")
	@ResponseBody
	public Iterable<Transacao> lista() {
		return transacaoDao.findAll();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/transacoes/paginada")
	@ResponseBody
	@Cacheable(value = "transacoes")
	public Iterable<Transacao> lista(int pagina, int size) {
		System.out.println("chegou aqui..");
		return transacaoDao.findAll(new PageRequest(pagina, size));
	}

	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/transacoes", method = RequestMethod.POST)
	@ResponseBody
	public String salva(Transacao transacao) throws InterruptedException {
		Thread.sleep(2000);
		return  "transacao salva";
	}

}
