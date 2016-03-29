package br.com.caelum.fj91.performance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
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
	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/transacoes")
	@ResponseBody
	public Iterable<Transacao> lista() {
		return transacaoDao.findAll();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/transacoes/paginada")
	@Cacheable(value = "transacoes")
	@Async
	public ResponseEntity<Iterable<Transacao>> lista(int pagina, int size) {
		System.out.println("chegou aqui..");
		HttpHeaders headers = new HttpHeaders();
		headers.add("max-age", "36000");
		ResponseEntity<Iterable<Transacao>> response = new ResponseEntity<Iterable<Transacao>>(
				transacaoDao.findAll(new PageRequest(pagina, size)),
				headers,
				HttpStatus.OK);
		
		return response;
	}

	// aqui ta com get so para facilitar o teste pelo navegador
	@RequestMapping(value = "/nova/transacao")
	@ResponseBody
	public String salva(Transacao transacao) throws InterruptedException {
		jmsTemplate.send("novas-transacoes", (session) -> {
			return session.createObjectMessage(transacao);
		});
		return "transacao salva";
	}

}
